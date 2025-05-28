package S10

fun main() {

    OopDog("흰둥이")
    val cat1 = OopCat1()
    println("cat1.name = ${cat1.name}")
}

open class OopAnimal(val name: String)

class OopDog(name: String): OopAnimal(name)

class OopCat1 : OopAnimal {
    constructor(): super("나비")
}


