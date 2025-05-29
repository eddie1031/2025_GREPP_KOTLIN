package S11

// infix

fun main() {

    val people1 = People("영희")

//    people1.eat("샌드위치")
//    people1 eat "햄버거"

    people1 eat "햄버거"
    People("팽흠") eat "콜라"

    people1 a 1 b 2

}

class People(val name: String) {

    infix fun eat(sth: String) {
        println("${name}이/가 ${sth}을/를 맛있게 먹습니다.")
    }

    infix fun a(t: Int): People {
        println("t = ${t}")
        return this
    }

    infix fun b(t: Int): People {
        println("t = ${t}")
        return this
    }

}



