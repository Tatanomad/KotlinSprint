package lesson_7

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val inputSec = readln().toInt()
    for (i in inputSec downTo 1) {
        println("Осталось секунд:$i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}