package chap17

fun main(){
    val x: IntArray = intArrayOf(1,2,3)
    x[0] = 4//　書き換え可能（増減不可）

    val y: List<Int> = listOf(1,2,3)
//    y[0] = 4// コンパイルエラー(Listは書き換え不可かつ増減不可)
}
