package com.example.kotlindemo.scope_function

// Kotlin run
/* The context object is available as a receiver (this). The return value is the lambda result.
   : run does the same as with but invokes as let - as an extension function of the context object.
   : run  is useful when your lambda contains both the object initialization and the computation of the return value.
   : Similar to the let function, the run function also returns the last statement.
   : Unlike let, the run function doesn’t support the it keyword.*/



fun main() {
    var str = "This is Kotlin tutorial"
    println(str)
    str = run {
        val str1 = "This is run function"
        str1
    }
    println("$str")

}