package S18

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {


    val asyncValue = async {
        delay(5000)
        "결과값"
    }

    println(asyncValue.await())
//    asyncValue.await()


}