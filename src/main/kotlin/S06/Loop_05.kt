package S06

fun main() {

    for ( i in 1..10 ) {

        if ( i == 5 ) {
            break
        }

        print("$i ")

    }
    println()

    for ( i in 1..3) {
        for ( j in 1..3 ) {
            if ( j == 2 ) break
            println("i = $i, j = $j")
        }
    }
    println()

    // i = 1, j = 1
    // i = 2, j = 1
    // i = 3, j = 1

    first@for ( i in 1..3) {
        for ( j in 1..3 ) {
            if ( j == 2 ) break@first
            println("i = $i, j = $j")
        }
    }
    println()

    // [
    //    [ 1, 2, 3],
    //    [ 4, 5, 6],
    //    [ 7, 8, 9]
    // ]
    val board = listOf(
        listOf(1,2,3),
        listOf(4,5,6),
        listOf(7,8,9),
    )

    val target = 5

    search@for ( i in board.indices ) {
        for ( j in board[i].indices ) {
            println("[${i}][${j}] = ${board[i][j]}")
            if ( board[i][j] == target ) {
                println("타깃 발견!")
                break@search
            }
        }
    }

}







