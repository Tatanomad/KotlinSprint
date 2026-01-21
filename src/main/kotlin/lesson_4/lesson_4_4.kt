package lesson_4

fun main() {
    val workoutDay = 5
    val isUpperBodyDay = workoutDay % 2 != 0
    val isLowerBodyDay = workoutDay % 2 == 0
    println(
        """
        Упражнения для рук: $isUpperBodyDay
        Упражнения для ног: $isLowerBodyDay
        Упражнения для спины: $isLowerBodyDay
        Упражнения для пресса: $isUpperBodyDay
        """.trimIndent()
    )
}