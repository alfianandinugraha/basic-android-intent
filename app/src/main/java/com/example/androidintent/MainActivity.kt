package com.example.androidintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.btn_to_login);
        val buttonToRegister = findViewById<Button>(R.id.btn_to_register)

        button.setOnClickListener {
            Intent(this, LoginActivity::class.java)
                .also {
                    startActivity(it);
                }
        }

        buttonToRegister.setOnClickListener {
            Intent(this, RegisterActivity::class.java)
                .also {
                    startActivity(it)
                }
        }
    }
}