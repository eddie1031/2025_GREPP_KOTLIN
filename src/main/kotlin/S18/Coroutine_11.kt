package S18

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun fetchData(): String {
    delay(3000)
    return "받아온 데이터!"
}

fun main() = runBlocking<Unit> {

//    println("그냥 호출! ${fetchData()}")

    val result = async { fetchData() }

    launch {
        repeat(5) { i ->
            delay(1000)
            println("작업 처리중 ... ${i+1}초 경과")
        }
    }

    println("데이터 받아오는 중")
    println(result.await())

}