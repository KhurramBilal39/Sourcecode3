package com.example.sourcecodepart3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.room.Room

class RoomMain : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_main)

        val edTitle:EditText = findViewById(R.id.etTitle)
        val edAmount:EditText = findViewById(R.id.etAmount)
        val add:Button = findViewById(R.id.btnAdd)


    }
}