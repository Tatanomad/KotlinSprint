package lesson_19

class StarshipAction(val name: String) {

    fun takeOff() {
        TODO("Реализация не готова, не забыть добавить")
    }

    fun landing() {
        error("Логика приземления не реализована")
    }

    fun shooting() {
        TODO()
    }
}

fun main() {
    val ship = StarshipAction("Alpha-1")

    println("Корабль ${ship.name} готов к работе.")
    ship.landing()
}
