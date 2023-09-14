package com.example.apiinteregationkasper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class SelectAnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_animal)

        findViewById<Button>(R.id.backToMAinBtn).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.catBtn).setOnClickListener{

            val intent = Intent(this, CatFactDisplayActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.dogBtn).setOnClickListener{
            val intent = Intent(this, DogFactDisplayActivity::class.java)
            startActivity(intent)
        }


    }
}