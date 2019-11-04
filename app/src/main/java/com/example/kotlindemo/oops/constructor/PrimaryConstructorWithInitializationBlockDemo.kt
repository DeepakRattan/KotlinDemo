package com.example.kotlindemo.oops.constructor

fun main() {
    val s = Student("ABC", 20)
    val e = Employee("Alex", 25)
    val p1 = Player()
    val p2 = Player("Sachin")
    val p3= Player("Sachin",50)

}

// 1. Primary constructor with initializer block

// Here, parameters sName and sAge inside the parenthesis accepts values "ABC" and 20 respectively
// when s object is created. However, sName and sAge are used without using var or val,
// and are not properties of the Student class.
// The Student class has two properties name and age are declared.
// When s object is created, code inside initializer block is executed.
// The initializer block not only initializes its properties but also prints them.

class Student(sName: String, sAge: Int) {
    var name: String = ""
    var age: Int = 0

    //Initialization Block

    // The primary constructor has a constrained syntax, and cannot contain any code.
    // To put the initialization code (not only code to initialize properties),
    // initializer block is used. It is prefixed with init keyword.
    init {
        name = sName.capitalize()
        age = sAge
        println("--------Student Info-----------")
        println("Name is $name")
        println("Age is $age")
    }

}


// 2. Alternate code to do the same

class Employee(_name: String, _age: Int) {
    // _name and _age are the parameters
    // name and age are the properties

    // It's more common to use _name and _age instead of completely different name
    // for constructor parameters.

    var name = _name
    var age = _age

    //Initializer block
    init {
        println("-------Employee Info------")
        println("name is $name")
        println("Age is $age")
    }


}

//3. Default Value in Primary Constructor
class Player(_name: String = "Unknown", _age: Int = 0) {
    var name: String = _name
    var age: Int = _age

    //Initializer block
    init {
        println("--------Player Info-------")
        println("Name = $name")
        println("Age = $age")
    }
}
