package com.example.androidnote.note

import java.util.*


// Generic(제너릭)
// 타입을 체크하는 기능

fun main(args:Array<String>){
    var q : Queue<Int> = LinkedList() // 큐로 선언하고 LinkedList 로 할당
    q.add(1)    // 객체를 큐에 추가 (큐가 가득찬 상태이면 illegalStateException 발생)
    q.offer(3)  // 객체를 큐에 추가 (큐가 가득찬 상태이면 false 반환)
    q.add(2)
    println(q)

    println()

    println(q.element())    // 맨 앞 객체 리턴 (큐가 비어있는 상태이면 NoSuchElementException 발생)
    println(q.elementAt(1)) // 인덱스 값의 객체 리턴
    println(q.peek())   // 맨 앞 객체 리턴 (큐가 비어있는 상태이면 false 반환)

    println()

    q.remove() // 1을 삭제하고 반환  // 삭제하면서 객체 반환 (큐가 비어있는 상태이면 NoSuchElementException 발생)
    println(q) // [3]
    var tmp = q.poll()  // 삭제하면서 객체 반환 (큐가 비어있는 상태이면 false 반환)
    println(q)
    println("두번째 삭제한 객체 : $tmp")

}