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
        //닉네임규정 버튼 클릭시 액티비티 전환
        val name_rule_btn = findViewById<View>(R.id.btn_main1) as Button
        name_rule_btn.setOnClickListener {
            val intent = Intent(applicationContext, Menu1Activity::class.java)
            startActivity(intent)
        }
    }

}