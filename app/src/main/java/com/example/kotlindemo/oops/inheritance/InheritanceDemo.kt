package com.example.kotlindemo.oops.inheritance

// Inheritance Demo
// Author : Deepak Rattan
// Date : November 3,2019
// This code demonstrates the use of inheritance in Kotlin

fun main() {
    println("-------------Person Info is -----------")
    // When the object of Person class is created,init block is called and prints the name and age of person.
    val p = Person("DR", 30)

    // When the object of Student class is created,it looks for the init block of the base class(Person)
    // and execute it.If the Student had init block, the compiler would have also executed
    // the init block of the derived class.
    println("-------------Student Info is -----------")
    val s = Student("DR1", 30, "Android")

    println("-------------Employee Info is -----------")
    val e = Employee("DR2", 30, "Developer")
}
// By default, classes in Kotlin are final.
// If you are familiar with Java, you know that a final class cannot be subclassed.
// By using the open annotation on a class, compiler allows you to derive new classes from it.
// The primary constructor of the Person class declared two properties: age and name
// and it has an initializer block. The initializer block (and member functions) of the
// base class Person can be accessed by the objects of derived classes

open class Person(name: String, age: Int) {

    // In Kotlin, init block is called when the object is created
    init {
        println("Name = $name and age is $age")
    }
}

class Student(name: String, age: Int, course: String) : Person(name, age) {
    init {
        println("course is $course")
    }

}

class Employee(name: String, age: Int, designation: String) : Person(name, age) {
    init {
        println("Designation is $designation")
    }

}

