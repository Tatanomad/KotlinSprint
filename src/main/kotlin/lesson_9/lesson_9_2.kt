package lesson_9

fun main() {
    val listOfIngridients = mutableListOf("Колбаса", "Сыр", "Хлеб")
    println("В рецепте есть базовые ингредиенты:")
    listOfIngridients.forEach { println(it) }
    println("Желаете добавить еще?")
    val userAnswer = readln()
    val yesAnswer = "Да"
    val isEqual = userAnswer.equals(yesAnswer, ignoreCase = true)
    if (isEqual) {
        println("Какой ингридиент хотите добавить?")
        val newIngridient = readln()
        listOfIngridients.add(newIngridient)
        println("Теперь в рецепте есть следующие ингредиенты:")
        listOfIngridients.forEach { println(it) }
    }

}