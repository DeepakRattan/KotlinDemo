package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlindemo.function.addNumbers
import com.example.kotlindemo.util.logD

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var sum: Int = addNumbers(10, 20)
        logD("Sum is $sum ")
    }
}
