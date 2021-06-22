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
    lateinit var btnSignIn: Button
    lateinit var btnSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnSignIn=findViewById(R.id.btnSignUp)
        btnSignIn.setOnClickListener {
            Toast.makeText(baseContext, "Loading...", Toast.LENGTH_LONG).show()
        }
        btnSignUp=findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            var intent2= Intent(baseContext,MainActivity2::class.java)
            startActivity(intent2)
        }
    }
}


