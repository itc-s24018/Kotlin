package chap07

    fun main() {
        val x = 75
        val a = x >= 50 && x <= 100
        val b = x < 50 || x > 100
        println("変数 x が 50から 100 範囲内にある： $a")
        println("変数 x が 50から 100 範囲外にある： $b")

    }