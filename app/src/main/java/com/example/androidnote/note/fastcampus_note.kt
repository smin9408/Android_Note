package com.example.androidnote.note


// 접근 제어자
// private 외부에서 사용 불가

fun main() {
    val testAccess: TestAccess = TestAccess("대길이")
    // testAccess.test()

    // testAccess.name = "대길이븅딱"
    // testAccess.test()
}

class TestAccess{
    private var name: String = "대길"

    constructor(name: String){
        this.name = name
    }

    private fun test(){
        println(this.name)
    }
}
