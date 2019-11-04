package com.example.kotlindemo.input_output

import java.util.*

// Input Output in Kotlin
//1. Use of readLine() function
//2. Use of Scanner

fun main() {
    print("Enter first number \n")
    // 1. To read a line of string in Kotlin, you can use readline() function.
    var num1: Int = readLine()!!.toInt()
    println("First number is $num1")

    //2. Use of Scanner
    println("Enter second number ")
    //Create Scanner Object
    var reader = Scanner(System.`in`)
    //reader object is used to take input from the user
    var num2: Int = reader.nextInt()
    println("Second Number is $num2")


}
