package chap39

fun main(){
    val plus1: (Double, Double) -> Double = fun(x:Double, y:Double):Double {
        return x + y
    }
    val plus2: (Double, Double) -> Double = fun(x, y) = x + y
    val plus3: (Double, Double) -> Double = { x, y -> x + y }

    println(plus1(1.0, 2.0))
    println(plus2(1.0, 2.0))
    println(plus3(1.0, 2.0))
}