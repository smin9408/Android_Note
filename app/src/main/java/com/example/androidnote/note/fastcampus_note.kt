package com.example.androidnote.note

fun main() {

    val emailList1 = arrayListOf<String>(
        "jay@naver.com",
        "john@naver.com",
        "emily@google.com",
        "ken@google.com",
        "stmdals@kakao.com"
    )

    val result1 = solution(emailList1)
    println(result1)

    val emailList2 = arrayListOf<String>(
        "Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.net",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antoni@google.com"
    )

    val result2 = solution(emailList2)
    println(result2)

}

fun solution(emailList: ArrayList<String>): Map<String, Int> {

    var naverCount = 0
    var googleCount = 0
    var elseCount = 0

    for (email in emailList) {
        val domain = email.split("@")[1]
        val emailItem = domain.split(".")[0]

        if (emailItem == "naver") {
            naverCount += 1
        } else if (emailItem == "google") {
            googleCount += 1
        } else {
            elseCount += 1
        }
    }

    val resultMap = mutableMapOf<String, Int>(
        "naver" to naverCount,
        "google" to googleCount,
        "else" to elseCount
    )

    return resultMap
}