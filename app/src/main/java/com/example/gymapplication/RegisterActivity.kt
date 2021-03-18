package com.example.gymapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gymapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val googleFirstName = intent.getStringExtra("google_first_name")
        val googleLastName = intent.getStringExtra("google_last_name")
        val googleEmail = intent.getStringExtra("google_email")
//        val googleProfilePicURL = intent.getStringExtra("google_profile_pic_url")
//        val googleAccessToken = intent.getStringExtra("google_id_token")


        google_first_name_textview.text = googleFirstName
        google_last_name_textview.text = googleLastName
        google_email_textview.text = googleEmail
//        google_profile_pic_textview.text = googleProfilePicURL
//        google_id_token_textview.text = googleAccessToken
    }
}