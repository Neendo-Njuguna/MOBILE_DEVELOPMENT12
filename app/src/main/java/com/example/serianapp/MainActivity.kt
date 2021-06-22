package com.example.serianapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogIn1: Button
    lateinit var btnSignUp1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogIn1=findViewById(R.id.btnLogIn1)
        btnSignUp1=findViewById(R.id.btnSignUp1)
        btnLogIn1.setOnClickListener {
            Toast.makeText(baseContext, "Loading...", Toast.LENGTH_LONG).show()
        }
        btnSignUp1.setOnClickListener {
            val intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}


