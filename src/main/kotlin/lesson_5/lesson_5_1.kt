package lesson_5

fun main() {
    val a = 2
    val b = 2
    val result = a + b
    println("Сколько будет $a + $b?")
    val inputResult = readln().toInt()
    if (result == inputResult)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен")
}