package lesson_6

fun main() {
    println("Введите количество секунд")
    val amountOfSec = readln().toLong()
    Thread.sleep(amountOfSec * 1000)
    println("Прошло $amountOfSec секунд")
}