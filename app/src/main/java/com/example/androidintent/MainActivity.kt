package com.example.androidintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonToRegister = findViewById<Button>(R.id.btn_to_register)
        val buttonLogin = findViewById<Button>(R.id.btn_login)
        val inputEmailView = findViewById<EditText>(R.id.input_email)
        val inputPasswordView = findViewById<EditText>(R.id.input_password)

        buttonLogin.setOnClickListener {
            val emailInput = inputEmailView.text.toString();
            val passwordInput = inputPasswordView.text.toString();

            val requireEmail = "responsi@pemrogramanmobile.com";
            val requirePassword = "mypassword123"

            if (emailInput != requireEmail || passwordInput != requirePassword) {
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_LONG).show()
            }

            Intent(this, HomeActivity::class.java)
                .also {
                    startActivity(it)
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