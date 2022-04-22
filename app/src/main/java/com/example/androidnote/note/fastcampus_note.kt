package com.example.androidnote.note


// 변수의 접근 범위
// 전역 변수 - 모든 곳에서 접근 가능
var number10: Int = 10

fun main() {
    println(number10)

    val test = Test("god")
    test.testFun()
    test.name
    println(test.name)
    println(number10)

}

// 지역 변수
class Test(var name: String){
    fun testFun(){
        var birth : String = "20022-04-22"
        name = "홍길동"
        number10 = 100
    }
}

