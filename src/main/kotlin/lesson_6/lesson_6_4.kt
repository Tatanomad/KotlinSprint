package lesson_6

fun main() {
    var numberOfAttempts = 5
    val hiddenNumber = (Math.random() * 10).toInt()
    var win = false
    println("Я загадал число от 1 до 9. У тебя есть 5 попыток!")

    while (numberOfAttempts > 0 && win == false) {
        print("Твой вариант: ")
        val guess = readln().toInt()
        if (guess == hiddenNumber) {
            println("Это была великолепная игра!")
            win = true
        } else {
            numberOfAttempts = numberOfAttempts - 1
            if (numberOfAttempts > 0) {
                println("Неверно. Осталось попыток: $numberOfAttempts")
            }
        }
    }
    if (win == false) {
        println("Было загадано число $hiddenNumber")
    }
}
