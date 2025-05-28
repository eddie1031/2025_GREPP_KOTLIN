package S10

fun main() {
    val animal = OrdAnimal()
    animal.eat("aa")

    val playWithAnimal = animal.play()
    playWithAnimal()

    animal.sleep(10)

    val huskey = OrdHuskey()
    huskey.sleep()
    huskey.sleep(10)
    huskey.eat("간식")

}

open class OrdAnimal {

    open fun eat(sth: String) = println("${sth}을/를 먹습니다!")
    /*
        fun eat(sth: String){
            println("${sth}을/를 먹습니다!")
        }
    */

    open fun play() : () -> Unit = {
        println("동물이 뛰어다닙니다!")
        println("즐거워합니다!")
    }

    fun sleep(hour: Int) = println("${hour}시간 만큼 낮잠을 잡니다.")

}

open class OrdDog: OrdAnimal() {

    override fun eat(sth: String) {
        println("${sth}을/를 먹습니다")
        println("멍!")
    }

//    override fun sleep(hour: Int) = println()

    // 오버로딩은 가능
    fun sleep() {
        println("낮잠을 잡니다")
        println("멍!")
    }

}

class OrdHuskey: OrdDog()

