package chap07

    fun main() {
        val delicious = true
        val cheep = true
        println("このレストランはおいしい： $delicious")
        println("このレストランは安い： $cheep")
        val letsEat = delicious || cheep
        println("食事する？： $letsEat")
    }
