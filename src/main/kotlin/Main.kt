import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    // 1 задача

    val myAge = 18
    val isTeenager: Boolean = 13 <= myAge && myAge <= 19
    println(isTeenager)

    // 2 задача

    val theirAge = 30
    val bothTeenagers: Boolean = 13 <= myAge && myAge <= 19 && 13 <= theirAge && theirAge <= 19
    println(bothTeenagers)

    // 3 задача

    val reader = "Stepan"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)

    // 4 задача

    val readerBeforeAuthor = reader < author
    println(readerBeforeAuthor)

    // 5 задача

    val myAge2: Int = 18
    if (13 <= myAge2 && myAge2 <= 19) {
        println("Подросток")
    } else println("Не подросток")

    // 6 задача

    val answer = if (13 <= myAge2 && myAge2 <= 19) println("Подросток") else ("Не подросток")

    // 7 задача

    var counter:Int = 0
    while (counter < 10)
    {
        var x:Int = counter
        counter++
        print(x)
    }


    // 8 задача
/*  Ругается на Random
    var counte: Int = 0
    var roll: Int = 0
    do {
        roll = Random().nextInt(6)
        counte++
        println("После $counter бросков, roll равен $roll")
    } while (counte < 0)
*/

    // 9 задача



    // 10 задача



    // 11 задача
    var sum: Int = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println()
    println(sum)
}

