package com.example.a0429test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_main1 = findViewById<View>(R.id.btn_main1) as Button
        btn_main1.setOnClickListener {
            val intent = Intent(applicationContext, Menu1Activity::class.java)
            startActivity(intent)
        }
        val btn_main2 = findViewById<View>(R.id.btn_main2) as Button
        btn_main2.setOnClickListener {
            val intent = Intent(applicationContext, Menu2Activity::class.java)
            startActivity(intent)
        }
    }

}