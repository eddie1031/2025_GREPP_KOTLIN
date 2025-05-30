package S17

import kotlin.concurrent.thread

class CoroutineThread(): Thread() {
    override fun run() {
        println("수행할 명령입니다! 현재 쓰레드 : ${Thread.currentThread().name}")
    }
}

class CoroutineThread2: Runnable {
    override fun run() {
        println("수행할 명령입니다! 현재 쓰레드 : ${Thread.currentThread().name}")
    }
}

fun main() {

    println("${Thread.currentThread().name}")

    val thread1: Thread = CoroutineThread()
    thread1.start()

    val thread2: Thread = Thread(CoroutineThread2())
    thread2.start()

    val thread3 = Thread {
        println("수행할 명령입니다! 현재 쓰레드 : ${Thread.currentThread().name}")
    }
    thread3.start()

    val thread4 = object : Thread() {
        override fun run() {
            println("수행할 명령입니다! 현재 쓰레드 : ${Thread.currentThread().name}")
        }
    }
    thread4.start()

    thread(start = false, name ="나비" ) {
        println("수행할 명령입니다! 현재 쓰레드 : ${Thread.currentThread().name}")
    }.start()


}