package com.example.kotlindemo.oops.getters_and_setters

fun main() {
    // When you instantiate object of the Person class and
    // initialize the name property, it is passed to the setters parameter value
    // and sets field to value.
    val p = Person()
    p.name = "DR"

    // Now, when you access name property of the object,
    // you will get field because of the code get() = field.
    println("Name is ${p.name}")


    val g = Girl()
    g.actualAge = 15
    g.age = 15

    println("Age is ${g.age}")
    println("Actual Age is ${g.actualAge}")

    val g1 = Girl()
    g1.actualAge = 33
    g1.age = 33
    println("Age is ${g1.age}")
    println("Actual Age is ${g1.actualAge}")


}

class Person {
    var name: String = "defaultName"
        //Getter
        get() = field
        //Setter
        set(value) {
            field = value
        }


}

// Changing value of the property using getters and setters
class Girl {
    var age: Int = 0
        //Getter
        get() = field
        //Setter
        set(value) {
            field = if (value < 18) 18
            else if (value >= 18 && value <= 30) value
            else value - 3
        }


    var actualAge: Int = 0
}

