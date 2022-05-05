package com.example.androidnote.note

import java.util.*


// Generic(제너릭)
// 타입을 체크하는 기능

fun main(args:Array<String>){
    var s = Stack<Int>()

    s.push(1) // 객체를 스택에 추가
    s.push(3)

    s.peek() // 맨 위의 객체 반환 (비어 있는 상태이면 EmptyStackException 발생)
    println(s)

    s.pop() // 맨 위의 객체 삭제하고 반환 (비어 있는 상태이면 EmptyStackException 발생)
    println(s)
}