package chap08


fun main() {
    val original: String = "あいうえお"

    val a: Byte = original.toByte()
    val b: Short = original.toShort()
    val c: Int = original.toInt()
    val d: Long = original.toLong()
    val e: Float = original.toFloat()
    val f: Double = original.toDouble()
    val g: String = original.toShort().toString()

    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("e = $e")
    println("f = $f")
    println("g = $g")

}