package lesson_9

fun main() {
    val omeletteRecipe = mutableListOf(2, 50, 15)
    println("Какое количество порций будете готовить?")
    val ammountOfPortion = readln().toInt()
    val newOmeletteRecipe = omeletteRecipe.map { it * ammountOfPortion }
    println("На $ammountOfPortion порции вам понадобится: яиц – ${newOmeletteRecipe[0]} шт, молока – ${newOmeletteRecipe[1]} мл, сливочного масла – ${newOmeletteRecipe[2]} гр")
}
