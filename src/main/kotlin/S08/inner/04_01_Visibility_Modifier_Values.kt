package S08.inner

fun main() {

    println("PUBLIC_VALUE = $PUBLIC_VALUE")
    println("INTERNAL_VALUE = $INTERNAL_VALUE")
    println("PRIVATE_VALUE = $PRIVATE_VALUE")

    publicFunction()
    internalFunction()
    privateFunction()

    val pubType: PublicType = PublicType()
    val privType: PrivateType = PrivateType()
    val interType: InternalType = InternalType()

    println("pubType = $pubType")
    println("privType = $privType")
    println("interType = $interType")

    val publicClass: PublicClass = PublicClass()
    publicClass.publicMethod()
    publicClass.internalMethod()
//    publicClass.protectedMethod()
//    publicClass.privateMethod()

    val childClass:ChildClass = ChildClass()
    childClass.callTest()

}


// public, protected, private, internal
public val PUBLIC_VALUE: String = "PUBLIC_VALUE"
internal val INTERNAL_VALUE: String  = "INTERNAL_VALUE"
private val PRIVATE_VALUE: String = "PRIVATE_VALUE"

public fun publicFunction(): Unit {
    println("Public Function!")
}

internal fun internalFunction(): Unit {
    println("Internal Function!")
}

private fun privateFunction(): Unit {
    println("Private Function!")
}

public class PublicType
private class PrivateType
internal class InternalType

open class PublicClass {

    // public, protected, private, internal
    public fun publicMethod() {
        println("Public Method!")
    }

    private fun privateMethod() {
        println("Private Method!")
    }

    internal fun internalMethod() {
        println("Internal Method!")
    }

    protected fun protectedMethod() {
        println("Protected Method!")
    }

}

class ChildClass : PublicClass() {
    // public private internal protected
    fun callTest() {
        println("ChildClass.callTest")
        publicMethod()
//        privateMethod()
        internalMethod()
        protectedMethod()
    }

}





