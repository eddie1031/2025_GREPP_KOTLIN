package S15

fun main() {

    val valueList: List<Int> = listOf(1,2,3,4)

    printElements(valueList)

    checkType(valueList)
    checkType("")

}

fun <T> printElements(list: List<T>): Unit {
    for (el in list) {
        print("$el ")
    }
    println()
}

fun <T> checkType(param: T) {
    if ( param is List<*> ) {
        println("param은 List 타입입니다!")
    } else {
        println("param은 List 타입이 아닙니다!")
    }
}



