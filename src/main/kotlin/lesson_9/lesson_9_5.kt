package lesson_9

fun main() {

    val listOfIngredients = mutableSetOf<String>()
    println("Введите 5 ингридиентов по одному:")
    for (i in 1..5) {
        val usersIngredients = readln().lowercase()
        listOfIngredients.add(usersIngredients)
    }
    val sortedIngredients = listOfIngredients.sorted()
    val output = sortedIngredients.joinToString(", ").replaceFirstChar { it.uppercase() }
    println(output)

}