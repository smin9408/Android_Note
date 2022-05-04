package com.example.androidnote.note


// Generic(제너릭)
// 타입을 체크하는 기능

fun main(args: Array<String>) {

    val name = "승민"

    println(name[1]) // 민
    var count = 0
    val names2 = arrayOf("Braund", "Mr. Owen Harris")
    val names = arrayOf(
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna", "Annie",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen", "Nellie",
        "Todoroff, Mr. Lalio"
    )

    for(name2 in names2){
        for(a in name2){
            if(a.toString().contains("M")){
                println("이게되네")
            }
        }
    }

    for (name in names) {
        for (cha in name) {
            if (cha.toString().contains("M")) {
                count ++
            }
        }
    }

    println(count)
}

// 문자열도 배열처럼 보네??