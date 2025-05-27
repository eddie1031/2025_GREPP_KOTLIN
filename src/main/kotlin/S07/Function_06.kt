package S07

fun main() {

    orderCoffee()

}

fun orderCoffee() {
    println("아메리카노 한 잔 주문하셨습니다!")
}

fun orderCoffee(type: String) {
    println("$type 한 잔 주문하셨습니다!")
}

fun orderCoffee(type: String, size: String) {
    println("$size 사이즈 $type 한 잔 주문하셨습니다!")
}

fun sum(a: Int, b: Int) : Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int) : Int {
    return a + b + c
}

fun sum(a: Double , b: Double): Double {
    return .0
}




