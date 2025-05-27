package S06

fun main() {

    // .. 연산자
    val range1 = 1 .. 5
    println(range1)

    val range2 = 1L .. 5L
    println(range2)

    val range3 = 'a' .. 'e'
    println(range3)

    val range4 = 5 downTo 1
    println(range4)

    val range5 = 1 .. 10 step 2
    println(range5)

    val range6 = 10 downTo 1 step 3
    println(range6)

    val range7 = 0 until 5
    println(range7)

    val s1 = 1 .. 10 step 2
    val t1 = 3

    println("t1 in s1? = ${t1 in s1}")
    println("t1 not in s1? = ${t1 !in s1}")

    val c1 = 1..5
    val c2 = 2..4
    val c3 = 1..20

    println("c1 include c2? = ${c1.first in c2 && c1.last in c2}")
    println("c2 include c1? = ${c2.first in c1 && c2.last in c1}")

    println("c2 include c3? = ${c2.first in c3 && c2.last in c3}")

}