package lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val isTentOpened: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"
    val favorableConditions = sunnyWeather && isTentOpened && (humidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

