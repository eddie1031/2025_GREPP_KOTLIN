package S13

// Data Transfer Object

data class MemberLabel(var name: String, val code: String)

data class CustomerInfo(var name: String, var grade: String) {
    init {
        if ( grade == "GOLD") name = "*${name}*"
    }
}

fun main() {

    val member1 = MemberLabel("MemberA", "MEMBER_A")
    val member2 = MemberLabel("MemberA", "MEMBER_A")

    println(member1 == member2)
    println(member1 === member2)

    println("member1.hashCode() = ${member1.hashCode()}")
    println("member2.hashCode() = ${member2.hashCode()}")

    val member3 = member2.copy("MemberB")

    println(member2.toString())
    println(member3.toString())

//    val member1Name = member1.name
//    val member1Code = member1.code

    val (member1Name, member1Code) = member1

    println("member1Name = ${member1Name}")
    println("member1Code = ${member1Code}")

    val (member2Name, _) = member2
    val (_, member2Code) = member2

    println("member2Name = ${member2Name}")
    println("member2Code = ${member2Code}")

    val member3Name = member3.component1()

    println("member3Name = ${member3Name}")

}
