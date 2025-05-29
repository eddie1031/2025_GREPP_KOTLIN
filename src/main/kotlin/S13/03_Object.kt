package S13

object Logger {

    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

}

object Config {

    val appName: String
    val version: String

    init {
        println("Config initialized")
        appName = "MyApp"
        version = "1.0"
    }

}

class Game {

    object Settings {
        val difficulty = "Hard"
        fun printSettings() = println("난이도 : $difficulty")
    }

}

interface ClickListener {
    fun onClick()
}

fun handleClick(listener: ClickListener) {
    listener.onClick()
}

open class ObjAnimal(val name: String) {
    open fun eat(sth: String) = println("$sth 를 먹습니다!")
}

object Dog : ObjAnimal("바둑이") {
    override fun eat(sth: String) {
        super.eat(sth)
    }
}

fun main() {

    Logger.log("Hello")

    Config.appName

    handleClick(object : ClickListener {
        override fun onClick() {
            println("버튼이 클릭되었습니다!")
        }
    })

//    Game.Settings.difficulty
    Game.Settings.printSettings()

    Dog.eat("간식")

}