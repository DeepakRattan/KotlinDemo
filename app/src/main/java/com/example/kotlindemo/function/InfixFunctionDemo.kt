package com.example.kotlindemo.function

import java.util.*

/*
Kotlin infix function notation

In Kotlin, a functions marked with infix keyword
can also be called using infix notation means calling without
 using parenthesis and dot. */
fun main() {
    var d = InfixFunctionDemo()
    val reader = Scanner(System.`in`)
    println("Enter a number")
    val num = reader.nextInt()
    val sq = d square num // Calling the function using infix notation
    println("Square of number is $sq")

    /* In the below example, the expressions 1 to "one", 2 to "two" etc, are
     infix notations of the function calls 1.to("one") and 2.to("two") etc.
     to() is an infix function that creates a Pair<A, B> from two values.
     */

    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("Map $map")

}

class InfixFunctionDemo {
    // infix function

    /* You can make a function call in Kotlin using infix notation if the function:
    a) is a member function (or an extension function).
    b) has only one single parameter.
    c) is marked with infix keyword.
    */


    //square(n : Int):Int

    infix fun square(n: Int): Int {
        return n * n
    }
}



