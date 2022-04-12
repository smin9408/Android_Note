package com.example.androidnote.note

fun main() {

    val a = 5
    val b = 10
    val value = 5

    // 조건문 when
    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("value is ${value}")
        }
    }

    // 축약약
   when (value) {
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("value is ${value}")
    }


}


