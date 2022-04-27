package com.example.androidnote.note


fun main() {

    val myCard: Card = Card("이승민", "940803", 500000)
    myCard.save(500000)
    myCard.check()
    myCard.out(250000)
    myCard.check()
}

class Card(val name: String, val birth: String, var money: Int) {
    fun create() {
        println("${birth} 년생 ${name}님의 계좌가 생성되었습니다.")
    }

    fun check() {
        println("게좌의 잔고는 ${money}원 입니다.")
    }

    fun out(outMoney: Int) {
        money -= outMoney
    }

    fun save(saveMoney: Int) {
        money += saveMoney
        val hue:String
        val hue2:String


    }

}