package com.example.androidnote.note


fun main() {

    // Class

    // 클래스를 통해서 객체를 만드는 방법
    // 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    // 우리가 만든 클래스는 자료형이 된다.
    val myCar: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("fast engine", "red", "2door")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val driveCar: DriveCar = DriveCar("engine", "body")
    driveCar.drive()
    driveCar.navi("우리 집")
    driveCar.ride()

    // 인스턴스의 멤버 변수에 접근 하는 방법
    val driveCar2: DriveCar2 = DriveCar2("2engine", "2body")
    println(driveCar2.body)
    println(driveCar2.engine)

}

// 클래스 만드는 방법(1)
class Car constructor(var engine: String, var body: String) { // constructor 생략가능

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

// 클래스 만드는 방법(3)
class Car2(engine: String, body: String) {
    var door: String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스 만드는 방법(4)
class Car3 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }


}

class DriveCar(engine: String, body: String) {
    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("${destination}로 목적지가 설정되었습니다")
    }
}

class DriveCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // 인스턴스화 될 때 가장 먼저 호출된다.
    // 초기값을 넣어 줄 때 유용하다.
    init {
        println("Car2가 만들어 졌습니다.")
        drive()
    }

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("${destination}로 목적지가 설정되었습니다")
    }
}