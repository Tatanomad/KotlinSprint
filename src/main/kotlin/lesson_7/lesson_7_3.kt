package lesson_7

fun main() {
    println("Введите число")
    val inputNumber = readln().toInt()
    for (i in 0..inputNumber) {
        if (i % 2 == 0) {
            println("$i")
        }
    }
}