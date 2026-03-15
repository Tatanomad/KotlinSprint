package lesson_19

enum class StarshipAction {
    TAKEOFF,
    LANDING,
    SHOOTING;

    fun action() {
        when (this) {
            TAKEOFF -> TODO("Реализация не готова, не забыть добавить")
            LANDING -> TODO()
            SHOOTING -> println("Выстрел произведен!")
        }
    }
}

fun main() {
    StarshipAction.LANDING.action()
    StarshipAction.TAKEOFF.action()

}