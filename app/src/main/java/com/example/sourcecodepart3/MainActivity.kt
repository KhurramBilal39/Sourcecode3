package com.example.sourcecodepart3

import com.android.volley.Request
import com.android.volley.Response
import org.json.JSONArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject


class MainActivity : AppCompatActivity() {


    val arrName:ArrayList<String>  = ArrayList()
    lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        getPlaceHolderData()
    }

    fun getPlaceHolderData(){

        val url = "https://jsonplaceholder.typicode.com/users"

        val requestQueue = Volley.newRequestQueue(this)

        val jsonArrayRequest =  JsonArrayRequest(Request.Method.GET,url, null,
            {response ->

              Log.d("RES",response.toString())

                for (i in 0  until response.length()){
                val jsonObj: JSONObject = response.getJSONObject(i)
                val name: String = jsonObj.getString("name")
                    val username:String = jsonObj.getString("username")
                    arrName.add("${name},${username}")
                    val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrName)
                    listView.adapter = arrayAdapter
            }
            },
            { error ->
            print(Log.d("error",error.toString()))

            }
        )
        requestQueue.add(jsonArrayRequest)
    }
}