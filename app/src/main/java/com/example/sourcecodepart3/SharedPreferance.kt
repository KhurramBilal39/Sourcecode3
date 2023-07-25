package com.example.sourcecodepart3

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SharedPreferance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferance)

        val btnLogin: Button = findViewById(R.id.btnLogout)

        btnLogin.setOnClickListener(View.OnClickListener {
            // Code for verificaion

            val sharedPreferance: SharedPreferences =  getSharedPreferences("LOG IN", MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferance.edit()

            editor.putBoolean("flag",false)
            editor.apply()



        })
    }
}