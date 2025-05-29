package S13

class HelloRobot {

    companion object {
        fun hello() {
            println("Hello! Hello! Hello!")
        }
    }

}

class ByeRobot {

    companion object {
        @JvmStatic
        fun bye() {
            println("Bye! Bye! Bye!")
        }
    }

}

fun main() {

    HelloRobot.hello()
    ByeRobot.bye()

    val robot = HelloRobot()
//    robot.hello()

}

