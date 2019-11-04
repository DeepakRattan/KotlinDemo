package com.example.kotlindemo.oops.inheritance

fun main() {
    // val p = Person1("Ram", 20)
    val s1 = Student1("Ram", 30, "Android")

}

// The open annotation on a class is the opposite of Java's final.
// it allows others to inherit from this class.
// By default, all classes in Kotlin are final.

open class Person1 {
    var name: String = ""
    var age: Int = 0

    //Secondary constructors
    constructor(_name: String, _age: Int) {
        name = _name
        age = _age
        println("Inside secondary constructor")
        // println("Name is $name and age is $age")
    }
}

class Student1 : Person1 {
    // course is the new property of Student1 class
    // name and age are the property of Person1 class which are inherited here
    var course: String = ""

    // To call the constructor of super class inside subclass ,super() method is used
    // this() method to call constructor within another constructor of same class
    constructor(_name: String, _age: Int, _course: String) : super(_name, _age) {
        course = _course
        println("Name is $name")
        println("Age is $age")
        println("Course is $course")
    }
}
