package com.example.androidintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonToLogin = findViewById<Button>(R.id.btn_to_login);

        buttonToLogin.setOnClickListener {
            Intent(this, MainActivity::class.java)
                .also {
                    startActivity(it)
                }
        }
    }
}