package com.example.gymapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.db.GymDatabase
import com.example.gymapplication.db.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CustomerDetailsMainViewModel(application: Application): AndroidViewModel(application) {
    private val tableRespository: Repository
    //observer for recyclerview
    lateinit var gymdetaillist: LiveData<List<CustomerDetails>>
    init {
        val dao= GymDatabase.getInstance(getApplication()).GymDao()
        tableRespository= Repository(dao)
        gymdetaillist=tableRespository.getcustrepositorytable()
    }
    fun inserttable(customerDetails: CustomerDetails)= viewModelScope.launch(Dispatchers.IO) {
        tableRespository.inserttablerepository(customerDetails)

    }
}