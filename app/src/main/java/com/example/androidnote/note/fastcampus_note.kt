package com.example.androidnote.note

fun main() {

    val student = Student()
    val teacher = Teacher()
    student.sleep()
}

// Interface
// 인터페이스는 약속
// 인터페이스를 구현하는 클래스는 인터페이스가 가지고 있는 기능을 반드시 구현해야 한다.
// 인터페이스 내부에서 구현되어 있다면 클래스에서는 구현하지 않아도 된다.
// 인터페이스는 생성자가 없다 -> 인스턴스화 시킬 수 없다.
interface Person {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    abstract fun study()
}

class Student() : Person {
    override fun study() {
    }


}

class Teacher() : Person {
    override fun study() {

    }


}