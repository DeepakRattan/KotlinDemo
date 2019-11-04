package com.example.kotlindemo.oops.inheritance

fun main() {
    val s = Student2(20)
    s.show()


}

open class Person2(val age: Int) {

    open fun show() {
        println("Person's Age is $age")
    }

}

class Student2(age: Int) : Person2(age) {
    override fun show() {
        println("Student's age is $age")
    }

}