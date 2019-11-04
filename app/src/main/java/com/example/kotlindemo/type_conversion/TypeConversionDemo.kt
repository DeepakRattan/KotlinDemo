package com.example.kotlindemo.type_conversion

fun main() {

    //Conversion form smaller to larger type
    var i: Int = 10;
    var j: Long = i.toLong()

    print(" i = $i and j = $j")

    //Conversion form larger to smaller type

    var d: Double = 76.87
    var b: Byte = d.toByte()
    print(" d = $d and b = $b")

}