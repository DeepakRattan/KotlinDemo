package com.example.kotlindemo.oops.abstraction

//Abstract class
//Author: Deepak Rattan

// 1.Abstract classes are always open. You do not need to explicitly
// use open keyword to inherit subclasses from them.

// 2. An abstract class cannot be instantiated (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.

// 3. The members (properties and methods) of an abstract class are non-abstract unless
// you explicitly use abstract keyword to make them abstract.


fun main() {
    val e = Employee("DR")
    e.show()
}

abstract class Person {
    open val age: Int = 0 // It's not mandatory for properties of an abstract class to be abstract
    abstract fun show()
}


class Employee(val name: String) : Person() {

    override val age = 10
    override fun show() {
        println("Name of Employee is $name and age is $age")

    }
}
