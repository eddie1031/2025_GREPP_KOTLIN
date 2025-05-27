package S02


fun main() {

    val name: String = "Mango"
    println("name = $name")

    val desc: String = """
       달콤하고 맛있는 노란색 망고
       오늘도먹고 내일도먹고
       매일 먹으면 얼마나 좋을까?
    """

    println(desc)

    println(desc.trimIndent())

    val favorite: String = "Favorite $name"
    println("favorite = $favorite")

    val number: Int = 20
    val sentence1 = "nu${number}mber"

    println("sentence1 = $sentence1")

    val price: Int = 20
    val amount = 10

    val sentence2 = "총 금액은 = ${price * amount}원 입니다"
    println("sentence2 = $sentence2")

}