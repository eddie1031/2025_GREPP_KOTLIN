package S16

import java.util.LinkedList
import java.util.Queue

interface CoAnimal

class CoCat: CoAnimal
class CoDog: CoAnimal

class CoAnimalHospital<out T> {

    private val receiptQueue: Queue<T> = LinkedList()

//    fun receipt(animal: T) {
//        receiptQueue.add(animal)
//    }

    fun call() : T {
        return receiptQueue.poll()
    }

}

fun main() {

    val catHospital = CoAnimalHospital<CoCat>()
    val dogHospital = CoAnimalHospital<CoDog>()
    var animalHospital: CoAnimalHospital<CoAnimal> = dogHospital

}


