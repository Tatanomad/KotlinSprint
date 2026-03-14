package lesson_19


enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

}

fun main() {
    println("Вы можете добавить этих рыбок в свой аквариум:")
    for (i in Fish.values())
        println(i.title)
}