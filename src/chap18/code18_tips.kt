package chap18

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.measureTimeMillis

fun main(){


    val targetSet = mutableListOf<Int>()
    for (x in 1..10000) {
        targetSet+= Random.nextInt(0..100_000)
    }
    val targetList = targetSet.toMutableList()



    val ListTime = measureTimeMillis {
        for (x in 0..100_000) {
            val result = targetList.contains(x)
        }
    }
    println("mutableList の検索時間: $ListTime ミリ秒")



    val setTime = measureTimeMillis {
        for (x in 0..100_000) {
            val result = targetList.contains(x)
        }
    }
    println("MutableSet の検索時間: $setTime ミリ秒")
}