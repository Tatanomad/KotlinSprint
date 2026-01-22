package lesson_4

fun main() {
    val workoutDay = 5
    val isLowerBodyToday = workoutDay % 2 == 0

    println(
        """
        Упражнения для рук: ${!isLowerBodyToday}
        Упражнения для ног: $isLowerBodyToday
        Упражнения для спины: $isLowerBodyToday
        Упражнения для пресса: ${!isLowerBodyToday}
        """.trimIndent()
    )
}