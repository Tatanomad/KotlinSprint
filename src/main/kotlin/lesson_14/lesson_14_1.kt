package lesson_14

open class Vessel(
    val name: String,
    val speed: Int,
    val liftingCapacity: Int,
    val capacity: Int,
    val chopIce: Boolean = false,
)

class Liner(name: String) : Vessel(name = name, 50, 5000, 5000)

class Cargo(name: String) : Vessel(name = name, 20, 100000, 30)

class Icebreaker(name: String) : Vessel(name = name, 10, 2000, 10, chopIce = true)

fun main() {
    val touristLiner = Liner("Титаник")
    val heavyCargo = Cargo("Ямал")
    val firstIcebreaker = Icebreaker("Камчатка")
}