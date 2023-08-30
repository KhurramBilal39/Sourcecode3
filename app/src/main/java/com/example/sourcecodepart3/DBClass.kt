package com.example.sourcecodepart3

import android.app.Application
import androidx.room.Room

class DBClass : Application() {
    companion object {
        lateinit var database: RoomDBHelper
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(applicationContext, RoomDBHelper::class.java, "RoomDBHelper")
            .build()
    }
}