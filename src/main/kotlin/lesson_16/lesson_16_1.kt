package lesson_16

private class Dice() {
    private val number = (1..6).random()
    fun getNumber() {
        println("На кубике выпало $number")
    }
}

fun main() {
    val diceNumber = Dice()
    diceNumber.getNumber()
}