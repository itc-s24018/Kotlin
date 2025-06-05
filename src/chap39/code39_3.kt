package chap39

fun main(args: Array<String>) {
    val function1: (String) -> String = fun(x: String) : String {
        return x + "ちゃん"
    }
    val function2: (String) -> String = fun(x: String) = x + "ちゃん"
    val function3: (String) -> String = {x -> x + "ちゃん"}
    val function4: (String) -> String = {it + "ちゃん"}
    // val function4: (String) -> String = { it -> it + "ちゃん" }

    val result1 = function1("たけし")
    val result2 = function2("たけし")
    val result3 = function3("たけし")
    val result4 = function4("たけし")

    println(result1)
    println(result2)
    println(result3)
    println(result4)

}