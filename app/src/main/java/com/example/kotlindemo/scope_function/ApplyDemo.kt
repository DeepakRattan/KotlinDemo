package com.example.kotlindemo.scope_function

// Kotlin apply
/*1. The context object is available as a receiver (this). The return value is the object itself.
  2. Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object.
  3. The common case for apply is the object configuration. Such calls can be read as “apply the following assignments to the object.”
  4. Kotlin apply is an extension function on a type. It runs on the object reference (also known as receiver) into the
     expression and returns the object reference on completion*/

data class Student(var name: String, var course: String)

fun main() {
    var s = Student("DR", "Kotlin")
    println("Student info before using apply is : $s")
    var s1 = s.apply {
        println("Student info inside apply block is : $s")
    }
    println(
        "Student info after updating course is : $s1"
    )

}

