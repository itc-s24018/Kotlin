package chap44

import kotlin.random.Random

data class Person(val name: String, val age: Int)

fun main() {
    val p = randomPerson()
    p?.let(::println) // .let どのクラスでも使える(nullじゃないときだけを指定する)
    println("おわり")
}

fun randomPerson(): Person? {
    return if (Random.nextBoolean()) {
        Person("タケシ",8)
    }else null
}