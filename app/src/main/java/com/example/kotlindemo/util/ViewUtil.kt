package com.example.kotlindemo.util

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun logD(message: String) {
    Log.d("test", message)
}