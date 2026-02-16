package lesson_10

fun main() {

    println("Начнем игру!")
    takeRound()
}

fun takeRound() {
    var win = 0
    do {
        val playerDice = rollDice()
        Thread.sleep(1000)
        println("Игрок бросил: $playerDice")
        val computerDice = rollDice()
        Thread.sleep(1000)
        println("Компьютер бросил: $computerDice")
        when {
            playerDice > computerDice -> {
                println("Победило человечество!")
                win++
            }

            playerDice < computerDice -> println("Победила машина!")
            else -> println("Победила дружба!")
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val agreement = readln()
        val isEqual = agreement.equals("Да", ignoreCase = true)

    } while (isEqual)
    println("Игра окончена. Ваших побед: $win")
}

