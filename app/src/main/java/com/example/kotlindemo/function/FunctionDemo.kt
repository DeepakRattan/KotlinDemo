package com.example.kotlindemo.function

fun main() {
    println("Function")
    var sum = addNumbers(10, 20)
    print("Sum is $sum")


    var name: String = getName("Deepak", "Rattan")
    println("Name is $name")

}

fun addNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

/* Here, the getName() function takes two String arguments, and returns a String.
You can omit the curly braces { } of the function body and specify the
body after = symbol if the function returns a single expression (like below example).
It is optional to explicitly declare the return type in such case because
the return type can be inferred by the compiler. In the above example, you can replace

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"
with
fun getName(firstName: String, lastName: String) = "$firstName $lastName"
*/

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"