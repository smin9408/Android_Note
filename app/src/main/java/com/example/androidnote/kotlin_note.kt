package com.example.androidnote

fun main() {
    helloWorld()
    println(add(3, 5))
}

// 1. 함수

fun helloWorld(): Unit {
    println("Hello World!!")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}


// 2. 변수

// val = value
// var = variable
fun hi() {

    val a: Int = 10

    var b: Int = 9
    b = 100

    val c = 50
}