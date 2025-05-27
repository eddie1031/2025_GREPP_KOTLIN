package S05

fun main() {

    val score: Int = 85

    val result1: String = if ( score > 89 ) {
        "A"
    } else if (score > 79 ) {
        "B"
    } else {
        "C"
    }
    println("result = $result1")

    val result2 = if ( score > 89 ) 'A' else if (score > 79 ) 'B' else 'C'
    println("result2 = $result2")

    val result3: String = if ( score > 89 ) {
        println("A로 합격하셨습니다!")
        "A"
    } else if (score > 79 ) {
        println("B로 합격하셨습니다!")
        "B"
    } else {
        println("C로 합격하셨습니다!")
        "C"
    }

    println("result3 = $result3")

}