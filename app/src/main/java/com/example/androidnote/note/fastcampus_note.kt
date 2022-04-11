package com.example.androidnote.note

fun main() {
    val int: Int
    var num = 10

    var a = 1 + 2 + 3 + 4 + 5 + 6
    var b = "1"
    var c = b.toInt()
    var d = b.toFloat()

    val num2: Int? = null


    plusMany(1,2,3,5,87,9,4,10)

    val n2 = sum(1, 2, 3, 4, 5)
    println(n2)

    val test = arrayOf("A", "B")
    showAll(*test)
}


fun name(first: Int, second: Int): Int {
    val result = first + second
    return result
}

// default 값을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수
fun printPlus(first: Int, second: Int): Unit {
    val result = first + second
    println(result)
}

// 함수 축약
fun shortFun(first: Int, second: Int):Int = first + second

fun plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number)
    }
}

fun sum(vararg num: Int) = num.sum()

fun showAll(vararg s: String) {
    println(s.joinToString())
}