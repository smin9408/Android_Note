package com.example.androidnote.note

import java.util.*


// 반복문
fun main() {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 66, 8, 9)

    // 반복하는 방법(1)
    for (item in a) {
        println(item)
    }

    // 반복하는 방법(2)
    // index, item 의 이름은 마음대로 정해도 가능
    // 첫번째 인자는 index, 두번째는 item
    for( (index, item) in a.withIndex()){
        println("index : ${index} value : ${item}")
    }


}



