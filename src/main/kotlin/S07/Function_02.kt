package S07

// main
fun main() {

//    sayWord()
//    sayWord(1)
    sayWord("Hello World!")

    sayName()
    sayName("Peng Xin")

    //
    orderCoffee("아메리카노", "Tall", true)
    orderCoffee(name="카페라떼", "Grande", true)
    orderCoffee(size="Tall", name="아메리카노", isIce = true)
//    orderCoffee(size="Tall", name="아메리카노", true)

    printCartList(4, "사과","딸기","참외", "수박")

    val cartList = arrayOf("감자", "고구마", "계란", "파")
    printCartList(cartList.size, *cartList)

    logging(msg=arrayOf("로그1","로그2","로그3"))
    logging("FATAL", "오류1", "오류2")

}

fun sayWord(word: String) {
    println(word)
}

fun sayName(name: String = "민수"): Unit {
    println("안녕하세요, ${name}님!")
}

fun orderCoffee(name: String, size: String, isIce: Boolean) {
    println("$size 사이즈 ${if (isIce) "아이스" else "핫"} $name(을)를 주문했습니다!")
}

fun printCartList(size: Int, vararg items: String) {
    println("$size 크기의 장바구니에 ${items.joinToString(", ")}(이)가 들어있습니다.")
}

fun logging(type: String = "INFO", vararg msg: String) {
    for (s: String in msg) {
        println("[${type}] $s")
    }
}






