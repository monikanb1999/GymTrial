package com.example.gymapplication

import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.databinding.ActivityCustomerDetailsBinding
import com.example.gymapplication.databinding.DetailsformBinding
import com.example.gymapplication.db.CustomerDetails
import kotlinx.android.synthetic.main.activity_customer_details.*
import java.util.*

class CustomerDetail : AppCompatActivity(),Handler {
    lateinit var binding: ActivityCustomerDetailsBinding
    private lateinit var adapter: GymRecyclerAdapter


    private val viewMODEL: CustomerDetailsMainViewModel by lazy {
        ViewModelProvider(this).get(CustomerDetailsMainViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityCustomerDetailsBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.handler = this



        adapter= GymRecyclerAdapter(this, this)
        binding.gymrecyclerview?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.gymrecyclerview?.layoutManager = layoutManager
        binding.gymrecyclerview?.adapter = adapter

        viewMODEL.gymdetaillist.observe(this, androidx.lifecycle.Observer {
            Log.d("listsize", "onCreate: ${it.size}")
            if (it.isNotEmpty()) {
                adapter.gymdetaillist = it
                adapter.notifyDataSetChanged()
            }
        })
    }
    override fun onAddClicked(view: View) {
        if (!TextUtils.isEmpty(binding.etname.text.toString())) {
            val table = CustomerDetails(
                0, binding.etname.text.toString(),
                binding.etage.text.toString().toInt(),
                binding.etgender.text.toString(),
                binding.etheight.text.toString(),
                binding.etweight.text.toString()
            )
            viewMODEL.inserttable(table)
            Toast.makeText(this, "done!!!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "done the process", Toast.LENGTH_LONG).show()
        }
    }

    override fun onremoveSelect(view: View) {
        Log.d("list", "onremoveSelect: ")
        Toast.makeText(this, "done process", Toast.LENGTH_LONG).show()

    }


    class GymRecyclerAdapter(private val context: Context, val customerDetail: CustomerDetail) : RecyclerView.Adapter<GymRecyclerAdapter.GymViewHolder>(){

        private val inflater: LayoutInflater = LayoutInflater.from(context)
        var gymdetaillist = emptyList<CustomerDetails>()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GymViewHolder {
            val binding: DetailsformBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.detailsform,
                parent,
                false
            )
            return GymViewHolder((binding))
        }

        override fun onBindViewHolder(holder: GymViewHolder, position: Int) {

           holder.binding.setVariable(BR.data, gymdetaillist[position])
            holder.binding.setVariable(BR.handler, customerDetail)
            holder.binding.executePendingBindings()
        }

        override fun getItemCount(): Int {
            return gymdetaillist.size
        }

        inner class GymViewHolder(val binding: DetailsformBinding) : RecyclerView.ViewHolder(binding.root)
    }
}



