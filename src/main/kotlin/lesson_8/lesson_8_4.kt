package lesson_8

fun main() {
    var arrayOfVinegret = arrayOf(
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
    for (i in arrayOfVinegret) {
        println(i)
    }
    println("Какой ингридиент вы хотите изменить?")
    val inputIngridient = readln()
    // val isIngridientExists = arrayOfVinegret.contains(inputIngridient)
    val index = arrayOfVinegret.indexOf(inputIngridient)
    if (index == -1) {
        println("Такого ингридиента в рецепте нет")

    } else {
        println("На что заменим ингридиент $inputIngridient?")
        val inputNewIngridient = readln()
        arrayOfVinegret[index] = inputNewIngridient
        println("Готово! Вы сохранили следующий список: ${arrayOfVinegret.joinToString(", ")}")
    }
}