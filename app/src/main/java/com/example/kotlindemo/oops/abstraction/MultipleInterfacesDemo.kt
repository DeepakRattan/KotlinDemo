package com.example.kotlindemo.oops.abstraction

// Kotlin does not allow true multiple inheritance.
// However, it's possible to implement two or more interfaces in a single class.

fun main() {
    val x = X()
    x.f1()
    x.f2()
}

interface Interface1 {
    fun f1()
}

interface Interface2 {
    fun f2()
}

class X : Interface1,
    Interface2 {
    override fun f1() {
        println("Function f1 of Interface1")
    }

    override fun f2() {
        println("Function f2 of Interface1")
    }

}