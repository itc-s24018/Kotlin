package chap37

fun main(args: Array<String>){

    val p = ::calculatePlus
    val m = ::calculateMinus

    println(p)
    println(m)

    println(p(2.0,3.0))//変数に入った関数は（）で値を与えられる
    println(m(2.0,3.0))

}

fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y