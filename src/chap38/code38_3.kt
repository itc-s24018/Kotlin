package chap38

fun main(){
    val closureA = getCountClosure()
    val closureB = getCountClosure()

    println("クロージャーがA返した値 = ${closureA()}")
    println("クロージャーがA返した値 = ${closureA()}")
    println("クロージャーがA返した値 = ${closureA()}")
    println("クロージャーがB返した値 = ${closureB()}")
    println("クロージャーがB返した値 = ${closureB()}")
    println("クロージャーがB返した値 = ${closureA()}")
}

fun getCountClosure(): () -> Int {
    var num = 0
    return fun() = ++num
}