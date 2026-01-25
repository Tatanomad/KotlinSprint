package lesson_5

fun main() {
    println("Введите первое число")
    val a = readln().toInt()
    println("Введите второе число")
    val b = readln().toInt()
    val winFirst = 30
    val winSecond = 15

    when {
        (a == winFirst && b == winSecond) -> println("Поздравляем! Вы выиграли главный приз!")
        (a == winSecond && b == winFirst) -> println("Поздравляем! Вы выиграли главный приз!")
        (a == winFirst || b == winSecond) -> println("Вы выиграли утешительный приз!")
        (a == winSecond || b == winFirst) -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
}
