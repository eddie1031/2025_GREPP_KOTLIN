package S03

data class Box(val name: String)

fun main() {

    val a = 10
    val b = 5
    val c = a
    val d = a

    val aEqb = a != b
    println("aEqb = ${aEqb}")

    val cRefEqd = c === d
    println("cRefEqd = ${cRefEqd}")

    val cRefNEqd = c !== d
    println("cRefNEqd = ${cRefNEqd}")

    val box1: Box = Box("A")
    val box2: Box = Box("A")
    val box3: Box = box1

    println(box1 == box2) // true
    println(box1 === box2) // false
    println(box1 === box3) // true


}