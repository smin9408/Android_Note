package com.example.androidnote.note


// Generic(제너릭)
// 타입을 체크하는 기능

fun main(args: Array<String>) {

    // 제너릭을 사용하지 않은 경우
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[3].toString() // 형 변환(타입 변환)

    // 제너릭을 사용하는 경우 -> 타입이 안전하다.
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장 받는다.

    // 강한 타입을 체크 할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "a", "b", "c", 3.14)
    val list4 = listOf<Int>(1, 2, 3, "a") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1, 2, 3, "가") // -> Any
    // 부모 : Any
    // 자식 : String, Int, Float, Boolean, ...
}
