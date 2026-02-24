package lesson_12

class Weather() {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var hasPrecipitation: Boolean = false

    fun printWeather() {
        val precipitationText = if (hasPrecipitation) "Ожидаются" else "Не ожидаются"
        println("Погода: днем $dayTemp°C, ночью $nightTemp°C. Осадки: $precipitationText")
    }
}

fun main() {
    val monday = Weather()
    monday.dayTemp = 13
    monday.nightTemp = 1
    monday.hasPrecipitation


    val tuesday = Weather()
    tuesday.dayTemp = 20
    tuesday.nightTemp = 5
    tuesday.hasPrecipitation = true

    monday.printWeather()
    tuesday.printWeather()
}