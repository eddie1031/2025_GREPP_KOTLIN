package S17

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

fun main() = runBlocking<Unit> {

    val startTime = System.currentTimeMillis()

    val services = List(100) { idx -> launch {
            println("작업 ${idx}번 시작 - 사용된 쓰레드 :${Thread.currentThread().name}")
            delay(2000)
            println("작업 ${idx}번 종료 - 사용된 쓰레드 :${Thread.currentThread().name}")
        }
    }

    services.forEach {
        it.join()
    }

    val endTime = System.currentTimeMillis()
    println("총 소요시간 = ${endTime - startTime} ms")

}