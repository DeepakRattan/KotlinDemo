package com.example.kotlindemo.oops.constructor

// Constructor
/*  A constructor is a concise way to initialize class properties.
    It is a special member function that is called when an object is instantiated (created).
    However, how they work in Kotlin is slightly different.
    In Kotlin, there are two constructors:

    1. Primary constructor - concise way to initialize a class
    2. Secondary constructor - allows you to put additional initialization logic


* */

fun main() {
    val p = Person("DR", 30)
    // p.show()
    println("Name is ${p.name}")
    println("Age is ${p.age}")
}

// Primary Constructor

// The primary constructor is part of the class header
// The block of code surrounded by parentheses is the primary constructor: (val firstName: String, var age: Int).
// The constructor declared two properties: firstName (read-only property as it's declared using keyword val)
// and age (read-write property as it is declared with keyword var).

class Person(val name: String, var age: Int) {

    fun show() {
        println("Name is $name and age is $age")
    }

}