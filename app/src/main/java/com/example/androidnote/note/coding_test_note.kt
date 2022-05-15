package com.example.androidnote.note

// 가장 가까운 사람의 이름을 알려주는 함수를 완성하세요
// 거리는 음수가 아닙니다 / 같은 거리는 없습니다.

fun main(){

    val result1 = solution("민수 : 3, 민지  : 4, 찬혁 : 1.5, 지우 : 2")
    println(result1)
    // 찬혁

    val result2 = solution("지영 : 3.7, 민영  : 1.2 , 해피 : 2.7, 퍼니 : 3")
    println(result2)
    // 민영

}


fun solution(str: String) : String {

    val list = str.split(",")
    //println(list)

    val nameList = mutableListOf<String>()
    val distanceList = mutableListOf<Double>()

    for (item in list) {

        val name = item.split(":")[0]
        val distance = item.split(":")[1].toDouble()

        nameList.add(name)
        distanceList.add(distance)

    }

    //println(nameList)
    //println(distanceList)

    val minDistance = distanceList.minOrNull()

    //println(minDistance)

    val resultIndex = distanceList.indexOf(minDistance)

    //println(resultIndex)



    return nameList[resultIndex].trim()
}

