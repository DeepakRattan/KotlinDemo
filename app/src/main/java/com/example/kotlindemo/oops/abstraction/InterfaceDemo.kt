package com.example.kotlindemo.oops.abstraction

// Interface

// Abstract classes in Kotlin are similar to interface with one important difference.
// It's not mandatory for properties of an abstract class to be abstract.

fun main() {
    val s = Student1()
    s.show()
    s.hello()
}

//Interface
interface Person1 {
    //abstract properties name and age
    val age: Int
    val name: String

    // abstract function show
    fun show()

    // Non abstract method can also be there in Interface.
    fun hello() {
        println("Hello")
    }
}

class Student1 : Person1 {
    override val age: Int = 20
    override val name: String = "ABC"
    override fun show() {
        println("Name is ${name} and Age is $age")

    }

}