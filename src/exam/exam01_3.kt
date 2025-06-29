package exam

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(100,9000)
    val pay = readln().toInt()

    if (num > pay){
        println("足りません")
    }
}