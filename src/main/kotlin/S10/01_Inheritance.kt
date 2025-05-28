package S10

fun main() {

    val subIns = SubClass()

    println("subIns.name = ${subIns.name}")
    subIns.introduce()

}

open class BaseClass {

    private val uniqueName: String = "BaseClass"

    open var name: String = "BaseClass"

    open fun introduce() {
        println("Hello World!")
    }

}

open class SubClass : BaseClass() {
    override fun introduce() {
        println("Hello World!!!!")
    }
}


