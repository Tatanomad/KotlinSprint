package lesson_12

class WeatherDay(var dayTemp: Int, var nightTemp: Int, var hasPrecipitation: Boolean) {

    fun printWeather() {
        val precipitationText = if (hasPrecipitation) "Ожидаются" else "Не ожидаются"
        println("Погода: днем $dayTemp°C, ночью $nightTemp°C. Осадки: $precipitationText")
    }
}

fun main() {
    val friday = WeatherDay(19, 10, true)
    friday.printWeather()
}