package com.example.sourcecodepart3

import android.content.Context
import androidx.room.Database

import androidx.room.RoomDatabase



@Database(entities = [RoomExpense::class], exportSchema = false, version = 1)

abstract class  RoomDBHelper : RoomDatabase() {

    private val DB_NAME = "expensedb"
    private var instance: RoomDBHelper? = null



    }
