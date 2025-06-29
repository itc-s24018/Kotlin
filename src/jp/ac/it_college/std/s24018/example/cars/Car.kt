package jp.ac.it_college.std.s24018.example.cars

class Car(val color: String) {
    open fun drive() {
        println("${color}の車が走っています。")
    }
}