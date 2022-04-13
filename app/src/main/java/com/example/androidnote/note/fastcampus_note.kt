package com.example.androidnote.note

import java.util.*

fun main() {

    // 배열

    // 배열 생성 방법(1)
    var arr1 = arrayOf<Int>(1, 2, 3, 4, 5, 6)

    // 배열 생성 방법(2)
    val arr2 = arrayOf("joro", "usop", 3, 4, 6, true, "hello")

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

    arr2[6] = 2
    val pl = arr2.plus("추가")
    println()
    println(Arrays.toString(arr2))
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])
    println(arr2[3])
    println(arr2[4])
    println(arr2[5])
    println(arr2[6])
    println()

    // 배열의 값을 바꾸는 방법(2)
    arr1[1] = 200
    println(arr1[1])


    // 배열 생성 방법(3)
    val a1 = intArrayOf(1, 2, 3) // int만 넣을 수 있는 배열
    val a2 = charArrayOf('A', 'B') // char -> '' , string -> ""
    val a3 = doubleArrayOf(1.5, 2.0, 2.4548)
    val a4 = booleanArrayOf(true, false, true)

    // 배열 생성 방법(4)
    // lambda를 이용한 배열 생성
    // 첫번째 인자는 size, 두번쨰는 들어갈 값  {  }부분을 람다라고 함
    var a5 = Array(10, { 0 }) // size가 10 -> index가 0 ~ 9, 0 으로 이루어진 배열

    var a6 = Array(5, { i -> i * 5 })
    a6.set(4,100)
    val a7 = a6[4]
    println(a7)

}


