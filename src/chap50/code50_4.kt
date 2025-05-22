package chap50

fun main(){
    print("もじをにゅうりょくしてください: ")
    val x = readln()
    print("もう一度入力してください: ")
    val y = readln()

    println(" 「$x」と「$y」が同じか ${x == y}")
}