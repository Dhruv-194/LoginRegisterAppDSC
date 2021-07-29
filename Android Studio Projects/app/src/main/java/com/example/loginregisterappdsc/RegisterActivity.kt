package com.example.loginregisterappdsc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button:Button = findViewById(R.id.RegBtn)
        button.setOnClickListener{
            val intent = Intent(this@RegisterActivity,TodayActivity::class.java)
            startActivity(intent)
        }

    }
}