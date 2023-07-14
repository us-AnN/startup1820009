package com.example.startup1820009

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.startup1820009.R

class ProfileActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var bioTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nameTextView = findViewById(R.id.nameTextView)
        bioTextView = findViewById(R.id.bioTextView)

        // Mendapatkan data profil dari sumber data (misalnya, database, API, atau preferensi bersama)
        val name = "M. Awfa Muhsin"
        val bio = "Seorang pengembang perangkat lunak"

        // Menampilkan data profil pada tampilan
        nameTextView.text = name
        bioTextView.text = bio
    }
}
