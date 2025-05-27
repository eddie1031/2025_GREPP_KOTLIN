package S02

fun main() {

//    val number: Int = null
//    val name: String = null

    val number: Int? = null
    println(number)

    val name: String?
//    println("name = $name")
    name = "Mango"
    println("name = $name")

    val s1: String = "s1"

    println(s1 is String )
    println(s1 is String?)

    val s2: String? = "s2"

    println(s2 is String )
    println(s2 is String?)

    val s3: String? = null
    println(s3 is String )
    println(s3 is String?)

    printLength(s1)
//    printLength(s2)
//    printLength(s3)

    _printLength(s1)
    _printLength(s2)
    _printLength(s3)

}

fun printLength(target: String): Unit {
    println("target 길이 : ${target.length}")
}

fun _printLength(target: String?): Unit {
    println("target 길이 : ${target?.length}")
}