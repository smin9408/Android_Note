package com.example.androidnote.note


fun main() {
    val a = mutableListOf<Int>()
    val b = mutableListOf<Boolean>()

    for (i in 0..9) {
        a.add(i)
    }

    for (i in 0..9) {
        b.add(true)
    }

    a.forEachIndexed { index, i ->
        if (i % 2 == 0) {
            b.set(index, true)
        } else {
            b.set(index, false)
        }
    }

    println(a)
    println(b)

    println()

    val grade = score(93)
    println(grade)

    println()

    val doubleNum = doubleSun(99)
    println(doubleNum)

    println()

    gugudan()
}

fun score(num: Int): String {
    return if (num > 80) {
        "A"
    } else if (num > 70) {
        "B"
    } else if (num > 60) {
        "C"
    } else {
        "F"
    }
}

fun doubleSun(a: Int): Int? {
    if (a >= 10 && a < 100) {
        return a / 10 + a % 10
    } else {
        return null
    }
}

fun gugudan() {
    for (a in 1..9) {
        for (b in 1..9) {
            println("${a} * ${b} = ${a * b}")
        }
    }
}