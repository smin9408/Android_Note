package com.example.androidnote.note


// 반복문
fun main() {

    // Class

    // 클래스를 통해서 객체를 만드는 방법
    // 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    // 우리가 만든 클래스는 자료형이 된다.
    val myCar: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("fast engine", "red", "2door")
}

// 클래스 만드는 방법(1)
class Car(var engine: String, var body: String) {

}


// 클래스 만드는 방법(2)
class SuperCar {
    var engine1: String
    var body1: String
    var door1: String

    constructor(engine2: String, body2: String, door2: String) {
        this.engine1 = engine2
        this.body1 = body2
        this.door1 = door2
    }


}