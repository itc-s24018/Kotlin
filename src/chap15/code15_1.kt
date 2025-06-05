package chap15

import kotlin.random.Random

fun main() {
    while(true) {
        val value = Random.nextInt(until = 100)
        println("乱数:$value")
        if (value < 10) break //この書き方以外では{}は省略しちゃだめ →breakの前に処理をさせたい場合ifの{}がないのでループしない
        /**
         * if (value)
         *     break    この書き方はミスを誘発するのでNG
         *              こうするなら{}をいれようね
         */
    }
}