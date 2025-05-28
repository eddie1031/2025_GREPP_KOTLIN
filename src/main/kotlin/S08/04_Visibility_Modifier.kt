package S08

import S08.inner.ChildClass
import S08.inner.INTERNAL_VALUE
import S08.inner.InternalType
import S08.inner.PUBLIC_VALUE
import S08.inner.PublicClass
import S08.inner.PublicType
import S08.inner.internalFunction
import S08.inner.publicFunction

//import S08.inner.*

fun main() {

    println("PUBLIC_VALUE = $PUBLIC_VALUE")
    println("INTERNAL_VALUE = $INTERNAL_VALUE")
//    println("PRIVATE_VALUE = $PRIVATE_VALUE")

    publicFunction()
    internalFunction()
//    privateFunction()

    val pubType: PublicType = PublicType()
    val interType: InternalType = InternalType()
//    PrivateType()

    println("pubType = $pubType")
    println("interType = $interType")

    val publicClass = PublicClass()
    publicClass.publicMethod()
    publicClass.internalMethod()
//    publicClass.protectedMethod()
//    publicClass.privateMethod()

    val childClass: ChildClass = ChildClass()
    childClass.callTest()

}



