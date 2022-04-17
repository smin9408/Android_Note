package com.example.androidnote.note


// 반복문
fun main() {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 66, 8, 9)
    val b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val c = arrayOf<String>("a", "b", "c", "d", "e")
    val d = arrayOf(1, 2, 3, 4, "a", "b", "c", "d", "e")

    // 반복하는 방법(1)
    for (item in a) {
        println(item)
    }

    // 반복하는 방법(2)
    // index, item 의 이름은 마음대로 정해도 가능
    // 첫번째 인자는 index, 두번째는 item
    for ((index, item) in b.withIndex()) {
        println("index : ${index} value : ${item}")
    }

    println()

    // 반복하는 방법(3)
    // it은 안드로이드가 정해주는 이름
    c.forEach {
        println(it)
    }

    println()

    // 반복하는 방법(4)
    // it을 사용하기 싫을 때 하는 방법
    d.forEach { element ->
        println(element)
    }

    println()

    // 반복하는 방법(5)
    // 람다의 장점 : 직관적임
    // index를 같이 나타낸다고 직관적으로 알 수 있음
    d.forEachIndexed { index, i ->
        println("index : ${index} value : ${i}")
    }

    println()

    // 반복하는 방법(6)
    for (i in 0 until a.size) { // until은 마지막을 포함하지 않는다.
        println(a[i])
        // a[i] == a.get(i)
    }

    println()

    // 반복하는 방법(7)
    // 2칸씩 건너뛰며 반복
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법(8)
    // 뒤에서부터 반복하기
    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법(9)
    // 뒤에서부터 반복하기
    // step 가능
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법(10)
    // 0 ~ 10
    // step 가능
    for (i in 0..10 step (3)) {
        println(i)
    }

}



