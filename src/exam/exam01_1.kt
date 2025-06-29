package exam

/**
 *  キーボードから入力された数字を入力して、１から入力された数までの
 *  FizzBuzz を入力します
 *  3の倍数のときにFizz
 *  5の倍数のときにBuzz
 *  3と5の倍数のときにFizzBuzz と出力
 */
fun main(){
    print("数字を入力してください: ")
    val input = readln().toInt()

    (1..input).forEach {
        val result = if (it % 15 == 0) {
            "Fizz Buzz"
        }else if(it % 3 == 0){
            "Fizz"
        }else if(it % 5 == 0){
            "Buzz"
        }else{
            it.toString()
        }
        println(result)
    }

}