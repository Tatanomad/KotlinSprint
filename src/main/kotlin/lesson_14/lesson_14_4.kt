package lesson_14

open class CelestialBodies(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBodies(name, hasAtmosphere, suitableForLanding)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val listOfSatellites: List<Satellite> = listOf()
) : CelestialBodies(name, hasAtmosphere, suitableForLanding)

fun main() {
    val fobos = Satellite("Фобос", hasAtmosphere = false, suitableForLanding = true)
    val deimos = Satellite("Деймос", hasAtmosphere = false, suitableForLanding = true)

    val mars = Planet(
        "Марс",
        hasAtmosphere = true,
        suitableForLanding = true,
        listOfSatellites = listOf(fobos, deimos)
    )
    val satellitesInfo = mars.listOfSatellites.joinToString(", ") { it.name }
    println("Планета ${mars.name}. Спутники: $satellitesInfo")
}