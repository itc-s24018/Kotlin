package chap37

fun main(args: Array<String>){

    val p = ::calculate_plus
    val m = ::calculate_minus

    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)

}

fun calculate_plus(x: Double, y: Double) = x + y
fun calculate_minus(x: Double, y: Double) = x - y

fun printRandomValuesCalculation(calculator: (Double,Double) -> Double) {//(Double,Double) -> Double \\Double型とdouble型のオブジェクトを入れ込んだらDouble型の戻り値を返してほしい
    val x = Math.random()
    val y = Math.random()
    val result = calculator(x,y)
    println("xの数字は→$x \n yの数字は→$y ")
    println("計算結果は${result}です。")
    println("--------------------")
}