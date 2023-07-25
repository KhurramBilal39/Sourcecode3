package com.example.sourcecodepart3

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class SharedPreferanceSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferance_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
                     val sharedPreferance: SharedPreferences? = getSharedPreferences("LOG IN", MODE_PRIVATE)
                    val check:Boolean = sharedPreferance!!.getBoolean("flag",false)
                    val iNext:Intent
            if (check){//for True (User is Logged in)
                iNext = Intent(this,SharedPreferance::class.java)
            }else{// for false (User is Logged Out or First time come)
                iNext = Intent(this,SharedPreferenceLoginActivity::class.java)
            }

            startActivity(iNext)

        },3000)
    }
}