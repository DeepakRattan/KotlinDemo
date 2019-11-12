package com.example.kotlindemo.scope_function

//Scope Function
/* Reference : https://kotlinlang.org/docs/reference/scope-functions.html

1. Kotlin “scope functions” are functions that allow for changing the scope, or the range, of a variable.
2. There are five such functions included in the Kotlin standard library:let,run,with,apply and also.
3. Basically, these functions do the same: execute a block of code on an object.
4. The scope functions do not introduce any new technical capabilities, but they can make your code
more concise and readable.

Distinctions
Because the scope functions are all quite similar in nature, it's important to understand the differences
between them. There are two main differences between each scope function:

1. The way to refer to the context object
    : run, with, and apply refer to the context object as a lambda receiver - by keyword "this".
    : let and also have the context object as a lambda argument - by keyword "it"

2. The return value
    : apply and also return the context object
    : let, run, and with return the lambda result.

 */

class Person(var name: String, var age: Int) {

    override fun toString(): String {
        return "Name is $name and age is $age"
    }

}


fun main() {

    // Without Scope function
    // Without let, we have to introduce a new variable and repeat its name whenever you use it.
    println("---Without Scope function---")
    val p = Person("DR", 30)
    println("Name is ${p.name} and age is ${p.age}")

    //using let
    println("----let block----")
    Person("DR1", 30).let {
        println("$it")
    }


    // Context object: this or it
    /* Inside the lambda of a scope function, the context object is available by a short reference
    instead of its actual name. Each scope function uses one of two ways to access the context object:
    a) as a lambda receiver (this)
                or
    b) as a lambda argument (it)*/

    var str = "Hello"
    //this
    str.run {
        println("Receiver string length = $length")
        // println("Receiver string length = $this.length") //does the same

    }

    //it
    str.let {
        println("Receiver string length = $it.length")

    }


}