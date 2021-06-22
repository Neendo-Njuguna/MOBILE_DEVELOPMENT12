package com.example.serianapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etEmail: EditText
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText
    lateinit var btnSignUp: Button
    lateinit var btnLogIn: Button

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
        btnLogIn = findViewById(R.id.btLogIn)
        btnSignUp = findViewById(R.id.btnSignUp)

        var genders = arrayOf("Male", "Female", "I prefer not to say")
        var gendersAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item,genders)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = gendersAdapter
        signup()
    }

    fun signup() {
        btnSignUp.setOnClickListener {
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
        btnLogIn = findViewById(R.id.btLogIn)
        btnLogIn.setOnClickListener {
            Toast.makeText(baseContext, "Please hold on a minute", Toast.LENGTH_LONG).show()

        }
    }
}