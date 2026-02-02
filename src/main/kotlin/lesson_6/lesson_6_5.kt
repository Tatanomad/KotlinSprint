package lesson_6

fun main() {
    var numberOfAttempts = 3
    var correctResult = false

    while (numberOfAttempts > 0 && correctResult == false) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        println("Решите пример: $number1 + $number2")
        val summResult = number1 + number2
        val userDecision = readln().toInt()
        if (userDecision == summResult) {
            println("Добро пожаловать!")
            correctResult = true
        } else {
            numberOfAttempts = numberOfAttempts - 1
            if (numberOfAttempts > 0) {
                println("Неверно. Осталось попыток: $numberOfAttempts")
            }
        }
    }
    if (correctResult == false)
        println("Доступ запрещен")
}