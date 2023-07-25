package com.example.sourcecodepart3

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SharedPreferenceLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference_login)


        val btnLogin:Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(View.OnClickListener {
            // Code for verificaion

            val sharedPreferance: SharedPreferences =  getSharedPreferences("LOG IN", MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferance.edit()

            editor.putBoolean("flag",true)
            editor.apply()

            val iHome:Intent = Intent(this,SharedPreferance::class.java)
            startActivity(iHome)

        })
    }
}