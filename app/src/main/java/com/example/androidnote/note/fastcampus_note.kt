package com.example.androidnote.note

import java.util.*


// Generic(제너릭)
// 타입을 체크하는 기능

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val q = PriorityQueue<Int>() // 오름차순

    val q2 = PriorityQueue<Int>(Collections.reverseOrder()) // 내림차순

    q.addAll(listOf(1,5,2,4,3))
    q2.addAll(listOf(1,5,2,4,3))

    // 우선순위가 높은 것부터 반환
    while(!q.isEmpty()) print("${q.poll()} ")
    println()
    while(!q2.isEmpty()) print("${q2.poll()} ")

}