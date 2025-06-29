package chap43

class Prius(color: String) : Car(color) {
    override fun letEngineWork(){
        println("スイーン")
        fuel = fuel - 0.5
    }
}