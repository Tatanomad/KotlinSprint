package lesson_10

fun main() {
    val playerDice = rollDice()
    Thread.sleep(1000)
    println("Игрок бросил: $playerDice")
    val computerDice = rollDice()
    Thread.sleep(1000)
    println("Компьютер бросил: $computerDice")
    when {
        playerDice > computerDice -> println("Победило человечество!")
        playerDice < computerDice -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}

fun rollDice() = (1..6).random()