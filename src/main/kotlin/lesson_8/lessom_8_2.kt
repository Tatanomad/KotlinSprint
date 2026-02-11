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
    for (i in arrayOfVinegret) {
        if (i == inputIngridient) {
            println("Ингридиент $i в рецепте есть")
            break
        }
    }
    println("Такого ингридиента в рецепте нет")
}