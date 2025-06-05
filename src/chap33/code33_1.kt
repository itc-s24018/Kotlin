package chap33

open class Car(val color: String) {//carクラスの.Anyは書かなくても書いたことになる(Anyクラスを指定)
    open fun drive() {
        println("${color}の車が走る!")
    }

    class Ferrari(color: String) : Car(color)//(Carクラスを指定)

    fun main(){
        val car = Car("赤")
        car.drive()
        println(car.toString())
    }
}