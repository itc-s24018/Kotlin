package chap43

class Car2(val color: String) {
    var fuel = 50.0
        protected set(value) { // セッターをprotectedにすると読み込みのみ可能になる
        }

    public fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠。で走れません!")
        }
    }

    protected open fun letEngineWork() {
        println("ブルｒｒーン！！")
        fuel - fuel - 1.0 //ガソリンを1L消費した
    }
}