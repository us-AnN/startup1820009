package com.example.startup1820009

// LoginActivity.kt

// LoginActivity.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import com.example.startup1820009.util.Pref

class LoginActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var pref: Pref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.edemail)
        passwordEditText = findViewById(R.id.edpasword)
        loginButton = findViewById(R.id.btnlogin)
        pref = Pref(this)

        if (pref.getIsLogin()) {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (validateCredentials(username, password)) {
                pref.setIsLogin(true)
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Handle invalid credentials
            }
        }
    }

    private fun validateCredentials(username: String, password: String): Boolean {
        val desiredUsername = "aan"
        val desiredPassword = "123"

        // Memeriksa apakah username dan password sesuai dengan nilai yang diinginkan
        if (username == desiredUsername && password == desiredPassword) {
            return true
        }

        return false
    }
    }
