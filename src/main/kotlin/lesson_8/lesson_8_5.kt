package lesson_8

fun main() {
    println("Сколько ингридиентов будет в вашем рецепте?")
    val ammountOfIngridients = readln().toInt()
    val arrayOfIngridients = Array(ammountOfIngridients) { "" }
    for (i in arrayOfIngridients.indices) {
        println("Введите ингридиент")
        val newIngridient = readln()
        arrayOfIngridients[i] = newIngridient
    }
    println("Готово! Вы сохранили следующий список: ${arrayOfIngridients.joinToString(", ")}")
}