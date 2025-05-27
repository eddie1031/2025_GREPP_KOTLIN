package S07

var npCounter: Int = 0

fun increaseNpCounter(x: Int): Int {
    npCounter++
    return x + npCounter
}

fun main() {

    println("npCounter = $npCounter")
    println(power(3)) // 9
    println(power(3)) // 9
    println(power(5)) // 25
    println(power(3)) // 9
    println("npCounter = $npCounter")

    println()

    println("npCounter = $npCounter")
    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println("npCounter = $npCounter")

    println()

    fun() {
        println("Hello World!")
    }

    val sayHello = fun() {
        println("Hello World!")
    }

    sayHello()

    val sayBye: () -> Unit = { println("Bye World!") }
    sayBye()

    println()

    val sum: (Int, Int) -> Int = {
        a, b ->
        println("입력받은 값 : ${a},${b}")
        a + b
    }
    val sumResult: Int = sum(2, 3)
    println("sumResult = $sumResult")

    val ap: (Int, Int) -> Int = ap@{ x, y ->
        if ( x > y ) {
            return@ap x
        }
        x + y
    }

    val app1 = ap(100, 200)
    val app2 = ap(200, 100)

    println("app1 = $app1")
    println("app2 = $app2")

}

fun power(x: Int): Int {
    return x * x
}

