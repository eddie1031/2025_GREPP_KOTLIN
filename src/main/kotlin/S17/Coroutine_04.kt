package S17

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    GlobalScope.launch {

        println("현재 스코프 : ${this.coroutineContext}")
        println("현재 쓰레드 : ${Thread.currentThread().name}")

    }

    Thread.sleep(3000)

}







