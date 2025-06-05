package chap39

import kotlin.random.Random

fun main() {
    // 引数（パラメータ）に関数を持つ関数かつ引数の関数をラムダ式でかく場合は丸括弧（）の外に関数をかける
    randomNumberCalculate(6) {
        it * 2 // ラムダ式なので最後の処理が返(return)される
    }
    //↑と同じ書き方
    randomNumberCalculate(100) {
        val square = it * it
        val cubic = square * it
        cubic
    }

    //※引数が”１つの関数”の場合は丸括弧（）不要
    //※引数に関数が”複数”ある場合は最後の関数以外、丸括弧（）に入れる必要がある
}

//引数（パラメータ）に関数を持つ関数
fun randomNumberCalculate(max: Int, calculator:(Int) -> Int) {
    val targetNumber = Random.nextInt(max + 1)
    val result = calculator(targetNumber)
    println("計算結果: ${result}")
}