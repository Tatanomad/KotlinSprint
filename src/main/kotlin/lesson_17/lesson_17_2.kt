package lesson_17

class Ship(
    shipName: String,
    val averageSpeed: Int,
    val port: String,
) {
    var name = shipName
        get() = field
        set(value) {
            println("Название корабля нельзя изменить")
        }
}

fun main() {
    val voyager = Ship("Вояджер", 50, "Роял")
    voyager.name = "Летучий голландец"
    println("Текущее название корабля: ${voyager.name}")
}