package com.example.androidnote.note


fun main(){

    solution(3)
    // *
    // **
    // ****

    solution(5)
    // *
    // **
    // ****
    // ********
    // ****************
}

fun solution(star : Int){

    // 별을 몇개 찍을지 알려주는 count
    var count = 1

    for(i in 1..star){


        for(j in 1..count){
            print("*")
        }

        println("")

        count = count * 2

    }

}