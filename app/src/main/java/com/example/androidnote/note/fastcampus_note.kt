package com.example.androidnote.note

import java.util.*

fun main() {

    // collection
    // list, set, map
    // Immutable Collection - 변경 불가

    // List
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList[1])
    println(numberList.get(2))


    // set
    // 중복을 허용하지 않음
    // 순서가 없다 - index가 없다.
    //
    val numberSet = setOf(1, 2, 3, 3, 3, "sds")
    numberSet.forEach {
        println(it)
    }


    // map
    // key, value 방식
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    val numberMap2 = mapOf("one" to 1, 2 to 2, 3.0 to 3)
    println(numberMap)
    println(numberMap2)
    println(numberMap.get("one"))
    println(numberMap["two"])
    println(numberMap2[3.0])


    // Mutable Collection - 변경 가능
    val mNumberList = mutableListOf<Int>(1, 2, 3, 4, 5)
    mNumberList.add(5, 6) // 5번째 인덱스에 6 추가
    mNumberList.add(3, 60) // 5번째 인덱스에 6 추가
    mNumberList.add(6, 100) // 5번째 인덱스에 6 추가
    mNumberList.add(50) // 5번째 인덱스에 6 추가
    println(mNumberList)


    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4, 4)
    mNumberSet.add(50)
    println(mNumberSet)


    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    mNumberMap.put("three", 3)
    mNumberMap.replace("one",100)
    println(mNumberMap)


}



