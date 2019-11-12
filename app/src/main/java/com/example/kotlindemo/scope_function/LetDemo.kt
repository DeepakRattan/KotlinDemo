package com.example.kotlindemo.scope_function

// Kotlin let
/* let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
   Kotlin let is a scoping function wherein the variables declared inside the expression cannot be used outside.*/

fun main() {

    var str = "Hello Android"

    str.let {
        println("$it!!")
    }

    var length = str.let {
        "$it".length
    }

    println("length of string = $length")

    // let for null check
    // Use safe call operator ?.
    var name: String? = "kotlin"
    name?.let { println(it) } //print kotlin

    name = null
    name?.let {
        println(it) // nothing happens as name is null
    }


}