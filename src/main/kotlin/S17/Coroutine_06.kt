package S17

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch {
        println("runBlocking: 현재 실행 스코프 : ${this.coroutineContext}")
        println("현재 실행중인 쓰레드 : ${Thread.currentThread().name}")
    }
}


