package com.example.kotlindemo.oops.nested_inner_class

// Nested Class
// Kotlin allows you to define a class within another class known as nested class.

fun main() {
    //Accessing member of Nested class
    val nested = Outer.Nested()

    println(nested.b)
    println(nested.callMe())

}
/*Nested class is a member of its enclosing class Outer, you can use . notation
to access Nested class and its members.*/

/*The nested class in Kotlin is similar to static nested class in Java.
In Java, when you declare a class inside another class, it becomes an
inner class by default.*/

class Outer {
    val a = "Outer"

    class Nested {
        val b = "Nested"
        fun callMe() = "Inside Nested Class"
    }

}
