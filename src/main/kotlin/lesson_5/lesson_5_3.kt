package lesson_5

fun main() {
    println("Введите первое число")
    val inputFirst = readln().toInt()
    println("Введите второе число")
    val inputSecond = readln().toInt()
    val win1 = 30
    val win2 = 15

    when {
        (inputFirst == win1 && inputSecond == win2) || (inputFirst == win2 && inputSecond == win1) -> println("Поздравляем! Вы выиграли главный приз!")
        (inputFirst == win1 || inputSecond == win2) || (inputFirst == win2 || inputSecond == win1) -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
    println("Выйгрышные номера: $win1 и $win2")
}
