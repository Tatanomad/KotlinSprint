package lesson_20

class Player(
    var hasKey: Boolean,
)

fun main() {
    val openDoor = { player: Player ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player(true)
    val playerWithoutKey = Player(false)

    println(openDoor(playerWithKey))
    println(openDoor(playerWithoutKey))
}