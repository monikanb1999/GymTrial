package com.example.gymapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInResult
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.common.api.ResultCallback
import com.google.android.gms.common.api.Status
import kotlinx.android.synthetic.main.activity_register.*

//, GoogleApiClient.OnConnectionFailedListener
class RegisterActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
//    lateinit var googleApiClient: GoogleApiClient
//    lateinit var gso: GoogleSignInOptions


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}



























//        val gso =
//                GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                        .requestIdToken("YOUR_WEB_APPLICATION_CLIENT_ID")
//                        .requestEmail()
//                        .build()
//        googleApiClient = GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API, gso
//        ).build()
//
//
//        signout.setOnClickListener {
//            Auth.GoogleSignInApi.signOut(googleApiClient).setResultCallback(ResultCallback<Status>() {
//                @Override
//                fun onResult(@NonNull status: Status) {
//                    if (status.isSuccess)
//                        gotoMainActivity()
//                    else {
//                        Toast.makeText(this, "logout failed", Toast.LENGTH_LONG).show()
//                    }
//                }
//            })
//        }
//    }
//    private fun gotoMainActivity() {
//        startActivity(Intent(this, MainActivity::class.java))
//        finish()
//    }
//    override fun onConnectionFailed(p0: ConnectionResult) {
//
//    }
//    private fun handleSignInResult(result: GoogleSignInResult){
//        if (result.isSuccess){
//            val account = result.signInAccount
//            google_first_name_textview.text = account!!.displayName
//            google_last_name_textview.text = account!!.displayName
//            google_email_textview.text = account!!.displayName
//        }
//        else{
//            gotoMainActivity()
//        }
//        }
//
//    override fun onStart() {
//        super.onStart()
//        val opr = Auth.GoogleSignInApi.silentSignIn(googleApiClient)
//        if (opr.isDone) {
//            val result = opr.get()
//            handleSignInResult(result)
//        }else{
//            opr.setResultCallback(ResultCallback<GoogleSignInResult>() {
//                @Override
//                fun onResult(@NonNull googleSignInResult: GoogleSignInResult) {
//                    handleSignInResult(googleSignInResult)
//                }
//            })
//        }
//    }
//}