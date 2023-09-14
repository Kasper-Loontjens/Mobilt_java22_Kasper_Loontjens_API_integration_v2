package com.example.apiinteregationkasper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class CatFactDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_fact_display)

        findViewById<Button>(R.id.returnCatBtn).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        var rq: RequestQueue = Volley.newRequestQueue(this)
        var url= "https://meowfacts.herokuapp.com/"
        var fact = "shiiiit cat"

        var jsonRequest = JsonObjectRequest( url,
            { res ->

                val jsonArr = res.getJSONArray("data")
                Log.d("bob", jsonArr.get(0).toString())
                fact = jsonArr.get(0).toString()


                val factDisplay = findViewById<TextView>(R.id.catFactText)
                factDisplay.setText(fact)

                //Log.d("Alrik",res.get("url").toString())

            } ,
            { err ->  Log.e("bob",err.toString()) }
        )
        rq.add(jsonRequest)



    }
}