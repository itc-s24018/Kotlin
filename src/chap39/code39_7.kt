package chap39

import kotlin.random.Random

fun main(){
    val randomSuffix = nameString()
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
}

//ラムダ式
fun nameString(): (String) -> String {
    return {// ここのreturnはあくまで関数の中の処理をみせるためのreturn
        val randomNumber = Random.nextInt(100)
        it + randomNumber // 最後の処理をreturnする
    }
}