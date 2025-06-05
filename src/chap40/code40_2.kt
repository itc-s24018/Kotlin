package chap40

class Person(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。 ${age}才です。")
    }

    fun displayName(): String {
        return "${name} (${age})"
    }
}

//　メンバ参照
fun main() {
    val p1 = Person("タケシ", 5)
    val p2 = Person("ケンタ", 5)
    val p3 = Person("ユミ", 8)
    val list = listOf(p1, p2, p3)
//    val pMax = list.maxBy ({p -> p.age })
    val pMax = list.maxBy(Person::age) // クラス名::プロパティ名　←関数名
    pMax.greet()
}