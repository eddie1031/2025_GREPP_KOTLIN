package io.eddie

// public, protected, private, internal
public val OTHER_PUBLIC_VALUE: String = "OTHER_PUBLIC_VALUE"
internal val OTHER_INTERNAL_VALUE: String  = "OTHER_INTERNAL_VALUE"
private val OTHER_PRIVATE_VALUE: String = "OTHER_PRIVATE_VALUE"

public fun otherPublicFunction(): Unit {
    println("Other Module Public Function!")
}

internal fun otherInternalFunction(): Unit {
    println("Other Module Internal Function!")
}

private fun otherPrivateFunction(): Unit {
    println("Other Module Private Function!")
}

public class OtherPublicType
internal class OtherInternalType
private class OtherPrivateType

open class OtherPublicClass {

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

class OtherChildClass : OtherPublicClass() {
    // public private internal protected
    fun callTest() {
        println("OtherChildClass.callTest")
        publicMethod()
//        privateMethod()
        internalMethod()
        protectedMethod()
    }

}





