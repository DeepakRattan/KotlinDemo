package com.example.kotlindemo.oops.constructor

fun main() {
    // val p = Person2("ABC", 20)
    //p.show()

    val s = Student2("DR", 30, "Android")
    s.show()
}

open class Person2 {
    var name: String = ""
    var age: Int = 0

    constructor(_name: String, _age: Int) {
        println("Secondary constructor called")
        name = _name
        age = _age
    }

    open fun show() {
        println("Name = $name and age is $age")
    }


}

class Student2 : Person2 {
    var course: String = ""

    constructor(_name: String, _age: Int, _course: String) : super(_name, _age) {
        course = _course
    }

    override fun show() {
        super.show()
        println("Course is $course")
    }


}