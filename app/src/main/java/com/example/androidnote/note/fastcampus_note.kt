package com.example.androidnote.note


fun main() {
    val ma1: Math1 = Math1()
    val m2 = ma1.plus(2,45)
    println(m2)
    val ma2: Math2 = Math2(20,310)
    val m3 = ma2.plus()
    println(m3)
}

class Math1(){
    fun plus(a: Int, b:Int) : Int{
        return a+b
    }
    fun minus(a: Int, b:Int) : Int{
        return a-b
    }
    fun gop(a: Int, b:Int) : Int{
        return a*b
    }
    fun na(a: Int, b:Int) : Int{
        return a/b
    }
}

class Math2(var a: Int, var b:Int){
    fun plus() : Int{
        return a+b
    }
    fun minus() : Int{
        return a-b
    }
    fun gop() : Int{
        return a*b
    }
    fun na() : Int{
        return a/b
    }
}