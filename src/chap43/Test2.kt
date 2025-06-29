package chap43

public fun testPublic() {
    println("可視性修飾子が public です。")
}

private fun testPrivate() {
    println("可視性修飾子が private です。")
}

fun testPublic2() {
    println("public な関数から private の関数を呼び出す")
    testPrivate()
}

public class TestPublic {

}
