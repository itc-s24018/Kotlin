package chap42

import jp.ac.it_college.std.s24018.example.cars.Car// このimportが無いと毎回パッケージを指定しなければならなくなる

fun main() {
    val c1 = Car(color = "赤")// Carにカーソルを合わせてAlt + Enter でインポート元を指定
    val c2 = Car(color = "青")
    c1.drive()
    c2.drive()
}