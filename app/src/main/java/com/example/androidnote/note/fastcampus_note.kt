package com.example.androidnote.note

fun main() {
    val int: Int
    var num = 10

    var a = 1 + 2 + 3 + 4 + 5 + 6
    var b = "1"
    var c = b.toInt()
    var d = b.toFloat()

    val num2: Int? = null

    println(name(5, 7))

}


fun name(first: Int, second: Int): Int {
    val result = first + second
    return result
}