package com.example.apiinteregationkasper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.factsPage).setOnClickListener{
            val intent = Intent(this, SelectAnimalActivity::class.java)
            startActivity(intent)
        }

/*
        var rq: RequestQueue = Volley.newRequestQueue(this)
        var url= "https://meowfacts.herokuapp.com/"
        var r: StringRequest = StringRequest(
            Request.Method.GET, url,
            {res -> Log.d("bob",res.toString())},
            {err -> Log.d("bob",err.toString())})
        rq.add(r)

        var jsonRequest = JsonObjectRequest( url,
            { res ->
                Log.d("bob",res.get("data").toString())
                Log.d("bob",res.toString())
                val jsonArr = res.getJSONArray("data")
                Log.d("bob", jsonArr.get(0).toString())

                //Log.d("Alrik",res.get("url").toString())

                */
/* vid array loopa igenom*//*

                */
/*  val jsonArray = res.getJSONArray("url");
                     for (i in 0 until jsonObject.length()){
                    Log.d("Alrik",jsonArray.getJSONObject(i).toString())
                }*//*
            } ,
            { err ->  Log.e("bob",err.toString()) }
        )
        rq.add(jsonRequest)

*/


    }
    override fun onBackPressed() {
        //super.onBackPressed()
    }
}