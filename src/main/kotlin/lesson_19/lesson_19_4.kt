package lesson_19


enum class Ammunition(val damage: Int, val title: String) {
    BLUE(5, "Синие"),
    GREEN(10, "Зеленые"),
    RED(20, "Красные");
}

class Tank {
    fun weapons(ammunition: Ammunition) {
        println("У вас ${ammunition.title} патроны")
    }

    fun shooting(ammunition: Ammunition) {
        println("Нанесенный урон: ${ammunition.damage}")
    }
}

fun main() {
    val t34 = Tank()
    val currentAmmunition = Ammunition.BLUE
    t34.weapons(currentAmmunition)
    t34.shooting(currentAmmunition)

}
