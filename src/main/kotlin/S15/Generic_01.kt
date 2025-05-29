package S15

fun main() {

    geFunc1(500)
//    geFunc1("500")

    geFunc2<String>("Hello, World!")
    geFunc2(1)

    geFunc3(300)
    geFunc3("300")

    val con1 = Container("A")


}

fun geFunc1(param: Any) {
//    val result = param - 100
    val result = param as Int - 100
    println("result = $result")
}

fun <T> geFunc2(param: T) {
    println("파라미터 타입 = ${param!!.javaClass.simpleName}")
}

fun <T> geFunc3(param: T) {
//    val result = param - 100
    val result = param as Int - 100
    println("result = $result")
}

class Container<T>(val value: T?) {

    fun get(): T? {
        return if (value != null) value else throw NoSuchElementException()
    }

}







