package lesson_5

import java.util.Calendar

fun main() {
    println("Введите год рождения")
    val yearOfBorn = readln().toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val countAge = currentYear - yearOfBorn

    if (countAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18