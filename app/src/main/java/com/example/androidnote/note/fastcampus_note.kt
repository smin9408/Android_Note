package com.example.androidnote.note

fun main() {

    val a = 5
    val b = 10

    // 조건문
    if (a < b) {
        println("a가 더 크다")
    } else {
        println("b가 더 크다")
    }

    // 값을 리턴하는 if 사용법
    val max = if (a < b) {
        a
    } else {
        b
    }

    // 축약
    val max2 = if (a < b) a else b
    println(max)

    // 엘비스 연산자
    val num1 : Int? = null
    val num2 = num1 ?: 10

    println(num1)
    println(num2)

}


