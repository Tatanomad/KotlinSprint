package lesson_9

fun main() {
    println("Введите 5 индгредиентов через запятую")
    val inputIngredients = readln()
    val listOfIngredients = inputIngredients.split(",")
    val sortedIngredients = listOfIngredients.sorted()
    println("Отсортированный список ингредиентов:")
    sortedIngredients.forEach { println(it) }
}