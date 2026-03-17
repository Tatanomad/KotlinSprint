package lesson_20

class Person(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun main() {
    val potion: (Person) -> Unit = { person ->
        person.currentHealth = person.maxHealth
    }

    val player = Person("Антон", 20, 100)
    potion(player)
    println("${player.name} излечился! Текущее здоровье: ${player.maxHealth}")
}