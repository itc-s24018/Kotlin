package chap39

fun main(){
    val list = listOf("あ","い","う","え","お")
    val action: (String) -> Unit = fun(x) { //何も返さないときはUnit　とかく
//  val action = fun(x: String) {} ↑と同じ意味  Unitかくのめんどかったらこっち
        println(x)
    }
    list.forEach(action)

    list.forEach{ println(it) }
}