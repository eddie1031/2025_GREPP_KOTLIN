package S08

import S08.inner.ChildClass
import S08.inner.INTERNAL_VALUE
import S08.inner.InternalType
import S08.inner.PUBLIC_VALUE
import S08.inner.PublicClass
import S08.inner.PublicType
import S08.inner.internalFunction
import S08.inner.publicFunction

import io.eddie.*

//import S08.inner.*

fun main() {

    println("PUBLIC_VALUE = $PUBLIC_VALUE")
    println("INTERNAL_VALUE = $INTERNAL_VALUE")
//    println("PRIVATE_VALUE = $PRIVATE_VALUE")

    println("OTHER_PUBLIC_VALUE = $OTHER_PUBLIC_VALUE")
//    println("OTHER_INTERNAL_VALUE = $OTHER_INTERNAL_VALUE")
//    println("OTHER_PRIVATE_VALUE = $OTHER_PRIVATE_VALUE")

    publicFunction()
    internalFunction()
//    privateFunction()

    otherPublicFunction()
//    otherInternalFunction()
//    otherPrivateFunction()

    val pubType: PublicType = PublicType()
    val interType: InternalType = InternalType()
//    PrivateType()

    val othPubType: OtherPublicType = OtherPublicType()
//    val othInterType: OtherInternalType = OtherInternalType()
//    val othPrivType: OtherPrivateType = OtherPrivateType()

    println("pubType = $pubType")
    println("interType = $interType")

    println("othPubType = $othPubType")

    val publicClass = PublicClass()
    publicClass.publicMethod()
    publicClass.internalMethod()
//    publicClass.protectedMethod()
//    publicClass.privateMethod()

    val othPubClass:OtherPublicClass = OtherPublicClass()

    othPubClass.publicMethod()
//    othPubClass.internalMethod()
//    othPubClass.privateMethod()
//    othPubClass.protectedMethod()

    val childClass: ChildClass = ChildClass()
    childClass.callTest()

    val othChildClass:OtherChildClass = OtherChildClass()
    othChildClass.callTest()

}



