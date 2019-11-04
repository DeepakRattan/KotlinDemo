package com.example.kotlindemo.oops.class_object

fun main() {
    var l1 = Lamp() //Create l1 object of Lamp class
    l1.turnOn()
    l1.displayLightStatus()
    l1.turnOff()
    l1.displayLightStatus()
}

class Lamp {
    //Property(Data Member)
    var isOn: Boolean = false

    //Member Functions
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn) {
            println("Lamp is On")

        } else {
            println("Light is Off")
        }

    }

}
