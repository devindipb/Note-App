package com.example.mycrudapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val Button2 = findViewById<Button>(R.id.second_act_btn)
        Button2.setOnClickListener {
            val Intent = Intent(this,MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}