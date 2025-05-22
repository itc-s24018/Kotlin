package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく") //mutableリストなので変更可能
    a.add(2,"どうぞ") //インデックス, エレメントで指定のインデックスにねじ込む
    a.add(0,"お願いします")
    for((i,x) in a.withIndex()) println("$i : ${x}") // 処理が一つしかないのでforの{}を書かずに実行
}