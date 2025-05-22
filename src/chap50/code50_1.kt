package chap50

fun main() {
    // 10回繰り返す
    repeat(times = 10) {
        println("forを使わないループ処理")
        println("${it}回目")
    }
}