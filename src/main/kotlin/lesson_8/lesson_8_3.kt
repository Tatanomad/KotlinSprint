package lesson_8

fun main() {
    val arrayOfVinegret = arrayOf(
        "Картофель",
        "Свекла",
        "Капуста квашеная",
        "Горошек",
        "Масло подсолнечное",
        "Морковь",
        "Лук",
        "Огурцы соленые",
        "Соль"
    )
    println("Какой ингридиент ищем?")
    val inputIngridient = readln()
    val isIngridientExists = arrayOfVinegret.contains(inputIngridient)
    if (isIngridientExists == true) {
        println("Ингридиент $inputIngridient в рецепте есть")

    } else
        println("Такого ингридиента в рецепте нет")
}