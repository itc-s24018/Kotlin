package chap18

fun main(){
    val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
    s.add("か") //.addでも+=でも追加可能
    s += "き"
    s += "く"
    println(s)
}