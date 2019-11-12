package com.example.kotlindemo.scope_function

// Kotlin With
/*Like apply, with is used to change instance properties without the need to call dot operator over the reference every time.*/

data class Person1(var name: String, var age: Int)

fun main() {
    var p = Person1("DR", 20)
    println("Before using with person info is : $p")
    with(p) {
        name = "DR1"
        age = 30
    }
    println("After using with person info is : $p")

}