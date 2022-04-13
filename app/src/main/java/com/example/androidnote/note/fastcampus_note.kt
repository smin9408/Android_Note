package com.example.androidnote.note

fun main() {

    // 배열

    // 배열 생성 방법(1)
    var arr1 = arrayOf<Int>(1, 2, 3, 4, 5, 6)

    // 배열 생성 방법(2)
    val arr2 = arrayOf("joro", "usop", 3, 4, 6)

    // 배열의 값을 꺼내는 방법(1)
    val test1 = arr1.get(3)
    println(test1)

    // 배열의 값을 꺼내는 방법(2)
    val test2 = arr2[1]
    println(test2)

    var arr3 = arrayOf(arr1, arr2)
    val test3 = arr3.get(1).get(0)
    println(test3)

    // 배열의 값을 바꾸는 방법(1)
    arr1.set(0, 100)
    println(arr1[0])

    // 배열의 값을 바꾸는 방법(2)
    arr1[1] = 200
    println(arr1[1])

}


