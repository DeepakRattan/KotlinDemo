package com.example.kotlindemo.oops.nested_inner_class

// Inner class
// Inner classes carry a reference to an outer class, and can access outer class members.

fun main() {
    // Object of Outer class
    val outer = Outer1()
    println("Using outer object : ${outer.Inner().callMe()}")

    // Object of Inner class
    val inner = Outer1().Inner()
    println("Using Inner Object : ${inner.callMe()} ")

}

class Outer1 {
    val a = "In Outer class"


    inner class Inner {
        val b = "Inside Inner class"
        fun callMe() = a // Inner class can access the member of outer class
    }
}
