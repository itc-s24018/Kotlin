package chap09

fun main(){ //varで変数を定義すると変数内の値が変更可能になる     ※valでは変更できない(基本はこっち使う)
    var a: Byte = 100
    var b: Short = 10000
    var c: Int = 1000000000
    var d: Long = 1000000000000000000L
    var e: Float = 0.123f
    var f: Double = 0.123456789
    var g: String = "こんにちは"

    println("a: $a")
    println("b: $b")
    println("c: $c")
    println("d: $d")
    println("e: $e")
    println("f: $f")
    println("g: $g")
    println("-------変更後------")
    a = 101
    println("a: $a")
}