package chap44

import java.awt.SystemColor.text

fun main() {
    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    "食事".getOneTwoFiveMessage()
    println(message)


}

fun String.getOneTwoFiveMessage(): String = "一に${this}、二に${this}、三、四がなくて五に${this}"

val String.oneTwoFiveMessage: String
    get() = "一に${this}、二に${this}、三、四がなくて五に${this}"