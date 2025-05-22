package exam01

fun main(){
    print("入場者数を入力してください: ")
    val numofpeaple = readln().toInt()
    var totalprice = 0

    if (numofpeaple >= 10){
        "各200円"
    }else{
        (1..numofpeaple).forEach{
            println("${it}人目の年齢を入力してください: ")
            val age = readln().toInt()
            if (age >= 65){
                totalprice += 1_300
            }else{
                totalprice += 800
            }
        }
        println("${totalprice}円")
    }
}