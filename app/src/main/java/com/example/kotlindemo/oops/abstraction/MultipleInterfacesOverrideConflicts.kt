package com.example.kotlindemo.oops.abstraction

// Resolving overriding conflicts (Multiple Interface)
fun main() {

    val c = C()
    c.callMe()
}

interface A {
    fun callMe() {
        println("Interface A")
    }

}

interface B {
    fun callMe() {
        println("Interface B")
    }

}

class C : A, B {
    override fun callMe() {
        // The statement super<A>.callMe() calls the callMe() method of class A.
        // Similarly, super<B>.callMe() calls the callMe() method of class B.
        super<A>.callMe()
        super<B>.callMe()
    }
}