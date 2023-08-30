package com.example.sourcecodepart3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.xml.sax.Attributes


class MainDatabase : AppCompatActivity() {


    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_database)
        // below code is to add on click
        // listener to our add name button
        val enterName:EditText = findViewById(R.id.enterName)
        val enterAge:EditText = findViewById(R.id.enterAge)
        val printName:Button = findViewById(R.id.printName)
        val Name:TextView = findViewById(R.id.Name)
        val Age:TextView = findViewById(R.id.Age)
        val addName:Button = findViewById(R.id.addName)
        addName.setOnClickListener{

            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = MyDBHelper(this, null)

            // creating variables for values
            // in name and age edit texts
            val name = enterName.text.toString()
            val age = enterAge.text.toString()

            // calling method to add
            // name to our database
            db.addName(name, age)

            // Toast to message on the screen
            Toast.makeText(this, name + " added to database", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            enterName.text.clear()
            enterAge.text.clear()
        }

        // below code is to add on  click
        // listener to our print name button
        printName.setOnClickListener{

            // creating a DBHelper class
            // and passing context to it
            val db = MyDBHelper(this, null)

            // below is the variable for cursor
            // we have called method to get
            // all names from our database
            // and add to name text view
            val cursor = db.getName()

            // moving the cursor to first position and
            // appending value in the text view
            cursor!!.moveToFirst()
            Name.append(cursor.getString(cursor.getColumnIndex(MyDBHelper.NAME_COl)) + "\n")
            Age.append(cursor.getString(cursor.getColumnIndex(MyDBHelper.AGE_COL)) + "\n")

            // moving our cursor to next
            // position and appending values
            while(cursor.moveToNext()){
                Name.append(cursor.getString(cursor.getColumnIndex(MyDBHelper.NAME_COl)) + "\n")
                Age.append(cursor.getString(cursor.getColumnIndex(MyDBHelper.AGE_COL)) + "\n")
            }

            // at last we close our cursor
            cursor.close()
        }
    }



    }



