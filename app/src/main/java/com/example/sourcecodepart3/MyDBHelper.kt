package com.example.sourcecodepart3

import android.database.sqlite.SQLiteOpenHelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.provider.Contacts.SettingsColumns.KEY


class MyDBhelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        private const val DATABASE_NAME = "ContactDB"
        private const val DATABASE_VERSION = 1
        private  const val TABLE_CONTACT = "contact"
        private  const val KEY_ID:String = "id"
        private  const val KEY_NAME:String = "name"
        private  const val KEY_PHONE:String = "phone"

        // Define your table name and column names here
        // For example:
        // const val TABLE_NAME = "my_table"
        // const val COLUMN_ID = "_id"
        // const val COLUMN_NAME = "name"
        // const val COLUMN_AGE = "age"
        // ...
    }

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL("CREATE TABLE  ${TABLE_CONTACT}" +
                " $KEY_ID  INTEGER PRIMARY KEY AUTOINCREMENT, $KEY_NAME TEXT," +
                "$KEY_PHONE  TEXT")
        // Create your database tables here
        // For example:
        // val createTableQuery = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_NAME TEXT, $COLUMN_AGE INTEGER)"
        // db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Handle database upgrades here
        // For example, you can drop and recreate the table:
        // val dropTableQuery = "DROP TABLE IF EXISTS $TABLE_NAME"
        // db?.execSQL(dropTableQuery)
        // onCreate(db)
    }
}
