package chap07

    fun main() {
        val delicious = true
        val cheep = false
        println("このレストランはおいしい： $delicious")
        println("このレストランは安い： $cheep")
        val letsEat = delicious || cheep
        println("食事する？： $letsEat")
    }
