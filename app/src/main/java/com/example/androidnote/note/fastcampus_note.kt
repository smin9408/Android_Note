package com.example.androidnote.note

fun main() {

    val CalculatorS = Calculator(10)
    CalculatorS.plus(20).minus(50).plus(600).multiply(2).answer().divide(10).answer()
}

// Chaining(체이닝)
// 자기 자신 클래스를 return 해서 기능을 이어 나가는 것

class Calculator(val initialValue: Int) {

    fun plus(number: Int): Calculator {
        val result = this.initialValue + number
        return Calculator(result)
    }

    fun minus(number: Int): Calculator {
        val result = this.initialValue - number
        return Calculator(result)
    }

    fun multiply(number: Int): Calculator {
        val result = this.initialValue * number
        return Calculator(result)
    }

    fun divide(number:Int): Calculator{
        val result = this.initialValue / number
        return Calculator(result)
    }

    fun answer(): Calculator{
        println(this.initialValue)
        return Calculator(this.initialValue)
    }

}