package com.example.kotlindemo.scope_function

// Kotlin also
/* 1. As the name says, also expressions does some additional processing on the object it was invoked.
   2. Unlike let, it returns the original object instead of any new return data. Hence the return data has always the same type.
   3. The context object is available as an argument (it). The return value is the object itself.
   4. also is good for performing some actions that take the context object as an argument.
   5. Use also for additional actions that don't alter the object, such as logging or printing debug information.
   */

fun main() {
    val numbers = mutableListOf("One", "Two", "Three")
    numbers.also {
        println("The list elements before adding new one : $it")
    }.add("Four")
    println("Updated List : $numbers")
}