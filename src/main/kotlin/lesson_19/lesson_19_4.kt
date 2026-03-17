package lesson_19


enum class Ammunition(val damage: Int, val title: String) {
    BLUE(5, "Синие"),
    GREEN(10, "Зеленые"),
    RED(20, "Красные");
}

class Tank {
    private var currentAmmunition: Ammunition? = null

    fun weapons(ammo: Ammunition) {
        currentAmmunition = ammo
        println("У вас ${ammo.title} патроны")
    }

    fun shooting() {
        val ammo = currentAmmunition
        if (ammo != null)
            println("Нанесенный урон: ${ammo.damage}")
        else
            println("Танк не заряжен.")

    }
}

fun main() {
    val t34 = Tank()
    val currentAmmunition = Ammunition.BLUE
    t34.weapons(currentAmmunition)
    t34.shooting()
}

