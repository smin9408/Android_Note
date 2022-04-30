package com.example.androidnote.note

fun main(args: Array<String>) {

    val bus = Bus("v6", "bus")

    bus.drive()

    val superCar = SuperCar()
    superCar.drive()
}

// class는 생성 시 private이기 때문에 open 키워드를 붙여야 상속이 가능하다.
// 부모 class의 함수도 마찬가지로 open 키워드를 사용해야 자식 class에서 override 가능
open abstract class Car() {
    open fun drive() {

    }

    fun stop() {

    }

    abstract fun new()
}

class SuperCar() : Car() {
    override fun drive(){
        println("더 빨리!")
    }

    override fun new() {
    }
}

class Electronic(engine: String, body: String) : Car() {
    override fun new() {

    }

}

class Bus(engine: String, body: String) : Car() {
    override fun new() {

    }


}