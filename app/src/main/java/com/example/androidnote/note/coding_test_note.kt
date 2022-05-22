package com.example.androidnote.note

// 리스트의 가장 작은 숫자를 찾아서 제거하고
// 남은 숫자들을 모두 더해서 값을 출력해주는 함수를 만드세요

fun main(){

    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution(input1)
    // 14

    val input2 = arrayListOf(10,8,6,4,2)
    val result2 = solution(input2)
    // 28

    val input3 = arrayListOf(6, 3, 9)
    val result3 = solution(input3)
    // 15

}


class Solution {
    fun solution(key1: Array<IntArray>, lock: Array<IntArray>): Boolean {
        var key = key1
        val extendLock = plusLock(lock)   //확장된 자물쇠의 배열 생성
        rotation@ for (rotation in 0 until 4) {  //회전 4번은 원상태임
            key = rotate(key)//키 회전
            for (x in 0 until lock.size * 2) {  //순회할 좌표
                for (y in 0 until lock.size * 2) {
                    for (i in 0 until key.size) {  //자물쇠와 연산할 열쇠의 좌표
                        for (j in 0 until key.size) {
                            //자물쇠 자리에 같은좌표의 열쇠 값을 더해줌
                            extendLock[x + i][y + j] += key[i][j]
                        }
                    }
                    //자물쇠 검사 통과하면 true 반환 후 종료
                    if (checkLock(extendLock)) return true

                    //다음 순회를 위해 더해줬던 열쇠값을 빼준다
                    for (i in 0 until key.size) {
                        for (j in 0 until key.size) {
                            extendLock[x + i][y + j] -= key[i][j]
                        }
                    }
                }
            }
        }
        return false

    }

    //실제 자물쇠 부분을 검사하는 함수
    fun checkLock(_extendLock: Array<IntArray>): Boolean {
        var size = _extendLock.size / 3
        for (x in size until size * 2) {
            for (y in size until size * 2) {
                //한 부분이라도 1이(돌기) 가 아니면 false
                if (_extendLock[x][y] != 1) return false
            }
        }
        return true
    }

    // 자물쇠 배열을 확장해주는 함수
    // 커밋 임시
    fun plusLock(_lock: Array<IntArray>): Array<IntArray> {
        var size = _lock.size * 3
        var temp = Array(size) { IntArray(size) { 0 } }

        for (i in 0 until size / 3) {
            for (j in 0 until size / 3) {
                temp[size / 3 + i][size / 3 + j] = _lock[i][j]
            }
        }
        return temp
    }

    //회전시키는 함수
    fun rotate(_key: Array<IntArray>): Array<IntArray> {
        var temp = Array(_key.size) { IntArray(_key.size) { 0 } }

        for (i in 0 until temp.size) {
            for (j in 0 until temp.size) {
                temp[j][temp.size - i - 1] = _key[i][j]
            }
        }
        return temp
    }
}