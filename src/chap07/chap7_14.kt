package chap07

import kotlin.random.Random

fun main(){
    val a = Random.nextInt(1, 100)
    if (a < 60){
        println("$a : D")
    }else if(a < 70){
        println("$a : C")
    }else if(a < 80) {
        println("$a : B")
    }else if(a < 90){
        println("$a : A")
    }else{
        println("$a : S")
    }
}