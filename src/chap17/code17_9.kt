package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく") //mutableリストなので変更可能
    a.removeAt(2)//removeAtで指定のインデックスを消去
    for((i,x) in a.withIndex()) println("$i : ${x}") // 処理が一つしかないのでforの{}を書かずに実行


    val b: MutableList<Int> = mutableListOf()// MutableList<>は関数なので　変数名:
    val c = mutableListOf<Int>()// mutableListOfでかくときは 変数名 =
}

