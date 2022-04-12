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

}


