package S04

val INTEGER_VALUE: Int = 10

fun main() {

    val isReulst: Boolean = INTEGER_VALUE is Int
    println("INTEGER_VALUE는 INT형 일까요? = $isReulst")

    val s1: String = "Hello, World!"
    val s2: String? = "Bye!"
    val i1: Int = 10

    printLength(s1)
    printLength(s2)
    printLength(i1)

    isNotInteger(s1)
    isNotInteger(s2)
    isNotInteger(i1)

}

fun printLength(target: Any?) {

    if ( target is String ) {
        println("문자열의 길이는 ${target.length}입니다.")
    } else {
        println("문자열이 아닙니다!")
    }

}

fun isNotInteger(target: Any?) {

    if ( target !is Int ) {
        println("정수가 아닙니다!")
        return
    }

    println("정수입니다!")
    println("target의 타입 = ${target.javaClass.simpleName}")

}
