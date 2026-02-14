package lesson_9

fun main() {
    val listOfIngridients = listOf("Колбаса", "Сыр", "Хлеб", "Помидор")
    println("В рецепте есть следующие ингредиенты:")
    listOfIngridients.forEach { println(it) }
}