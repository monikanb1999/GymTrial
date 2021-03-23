package com.example.gymapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.GoogleApi
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_main.*
//,GoogleApiClient.OnConnectionFailedListener
//lateinit var googleApiClient: GoogleApiClient
//lateinit var mGoogleSignInClient: GoogleSignInClient
//private val RC_SIGN_IN = 9001

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


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
//
//        googleApiClient=GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,gso
//        ).build()
//
//        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
//
//        sign_in_button.setOnClickListener {
//            signIn()
//        }
//    }
//
//    private fun signIn() {
//        val signInIntent = mGoogleSignInClient.signInIntent
//        startActivityForResult(
//                signInIntent, RC_SIGN_IN
//        )
//    }
//
//    private fun signOut() {
//        mGoogleSignInClient.signOut()
//                .addOnCompleteListener(this) {
//                    // Update your UI here
//                }
//    }
//
//    private fun revokeAccess() {
//        mGoogleSignInClient.revokeAccess()
//                .addOnCompleteListener(this) {
//                    // Update your UI here
//                }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == RC_SIGN_IN) {
//            val result =
//                    GoogleSignIn.getSignedInAccountFromIntent(data)
////            handleSignInResult(task)
//            if (result.isSuccessful){
//                startActivity(Intent(this, RegisterActivity::class.java))
//            finish()}
//            else{
//                Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show()
//            }
//        }
//    }
//
//    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
//        try {
//            val account = completedTask.getResult(
//                    ApiException::class.java
//            )
//            // Signed in successfully
//
//            val googleFirstName = account?.givenName ?: ""
//            Log.i("Google First Name", googleFirstName)
//
//            val googleLastName = account?.familyName ?: ""
//            Log.i("Google Last Name", googleLastName)
//
//            val googleEmail = account?.email ?: ""
//            Log.i("Google Email", googleEmail)
//            Log.d("hufgifg",googleEmail)
////            val googleProfilePicURL = account?.photoUrl.toString()
////            Log.i("Google Profile Pic URL", googleProfilePicURL)
////
////            val googleIdToken = account?.idToken ?: ""
////            Log.i("Google ID Token", googleIdToken)
//
//
//            val myIntent = Intent(this, RegisterActivity::class.java)
//            myIntent.putExtra("google_first_name", googleFirstName)
//            myIntent.putExtra("google_last_name", googleLastName)
//            myIntent.putExtra("google_email", googleEmail)
////            myIntent.putExtra("google_profile_pic_url", googleProfilePicURL)
////            myIntent.putExtra("google_id_token", googleIdToken)
//            this.startActivity(myIntent)
//        } catch (e: ApiException) {
//            // Sign in was unsuccessful
//            Log.e(
//                    "failed code=", e.statusCode.toString()
//            )
//        }
//    }

//    override fun onConnectionFailed(p0: ConnectionResult) {
//        TODO("Not yet implemented")
//    }
//}