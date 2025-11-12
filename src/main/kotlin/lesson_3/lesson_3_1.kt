package lesson_3

fun main() {
    val userName = "Таня"
    var greeting: String // Переменная для хранения текста приветствия

    greeting = "Добрый день, $userName!" // Приветствие для дня
    println("Дневное приветствие: $greeting")
    greeting = "Добрый вечер, $userName!" // Приветствие для вечера
    println("Вечернее приветствие: $greeting")
}