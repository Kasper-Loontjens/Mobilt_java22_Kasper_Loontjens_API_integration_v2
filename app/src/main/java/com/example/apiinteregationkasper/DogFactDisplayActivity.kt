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

class DogFactDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_fact_display)


        findViewById<Button>(R.id.returnDogBtn).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        var rq: RequestQueue = Volley.newRequestQueue(this)
        var url= "https://dogapi.dog/api/v2/facts"
        var fact= "shit"

        var jsonRequest = JsonObjectRequest( url,
            { res ->
                val jsonArr = res.getJSONArray("data")

                val jsonObj = jsonArr.getJSONObject(0)
                val jsonObj2 = jsonObj.getJSONObject("attributes")
                val newFact = jsonObj2.get("body").toString()
                fact = newFact

                val factDisplay = findViewById<TextView>(R.id.dogFactText)
                factDisplay.text = fact

            } ,
            { err ->  Log.e("bob",err.toString()) }
        )
        rq.add(jsonRequest)
    }

}