package S09

fun main() {

    val 민수 = OopStudent()
    println("민수.name = ${민수.name}")
    println("민수.name = ${민수.name}")

    val reader = OopFileReader()

    val contents1 = reader.contents
    println("contents1 = $contents1")

    val contents2 = reader.contents
    println("contents2 = $contents2")

}

class OopStudent {

    val name: String by lazy {
        "민수"
    }

}

class OopFileReader {

    val contents: String by lazy {
        println("파일을 읽어들이는 무거운 작업을 수행합니다.")
        "엄청_무거운_작업_이후_읽어들인_파일_내용"
    }

}



