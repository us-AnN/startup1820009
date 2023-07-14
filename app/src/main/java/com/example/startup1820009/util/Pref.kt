package com.example.startup1820009.util

// Pref.kt

import android.content.Context
import android.content.SharedPreferences

class Pref(private val context: Context) {
    private val sharedPref: SharedPreferences by lazy {
        context.getSharedPreferences("Mypref", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean) {
        sharedPref.edit().putBoolean("login", value).apply()
    }

    fun getIsLogin(): Boolean {
        return sharedPref.getBoolean("login", false)
    }
}
