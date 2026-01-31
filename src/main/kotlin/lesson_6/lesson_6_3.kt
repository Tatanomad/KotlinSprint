package lesson_6

fun main() {
    println("Введите количество секунд")
    var amountOfSec = readln().toLong()

    while (amountOfSec > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: ${amountOfSec--}")
    }
    println("Время вышло")
}