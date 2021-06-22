package com.example.serianapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etEmail: EditText
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText
    lateinit var btnSignUp2: Button
    lateinit var btnLogIn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castView()
    }

    fun castView() {
        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        etPassword = findViewById(R.id.etPassword)
        btnLogIn2 = findViewById(R.id.btnLogIn2)
        btnSignUp2 = findViewById(R.id.btnSignUp2)

        val genders = arrayOf("Male", "Female", "I prefer not to say")
        val genderAdapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter
        signup()
    }
    fun signup() {
        btnSignUp2.setOnClickListener {
            var name = etName.text.toString()
            if(name.isEmpty()){
                etName.setError("Input Name")
            }
            var gender = ""

            var email = etEmail.text.toString()
            if (email.isEmpty()) {
                etEmail.setError("Input Email Address")
            }
            var phone = etPhone.text.toString()
            if (phone.isEmpty()) {
                etPhone.setError("Input Phone")
            }
            var password = etPassword.text.toString()
            if (password.isEmpty()) {
                etPassword.setError("Input Password")
            } else {
                    Toast.makeText(baseContext, "Account Successfully Created!", Toast.LENGTH_LONG)
                        .show()
                }
            logIn()

        }
    }
    fun logIn (){
        btnLogIn2= findViewById(R.id.btnLogIn2)
        btnLogIn2.setOnClickListener {
            val intent= Intent(baseContext, MainActivity::class.java)
            startActivity(intent)

            }
        }
    }
