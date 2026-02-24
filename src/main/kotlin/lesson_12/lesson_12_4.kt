package lesson_12

class WeatherEveryDay(dayTemp: Int, nightTemp: Int, _hasPrecipitation: Boolean) {

    var dayTemp = dayTemp - CELSIUS_TO_KELVIN
    var nightTemp = nightTemp - CELSIUS_TO_KELVIN
    var hasPrecipitation = _hasPrecipitation

    init {
        printWeather()
    }

    fun printWeather() {
        val precipitationText = if (hasPrecipitation) "Ожидаются" else "Не ожидаются"
        println("Погода: днем $dayTemp°C, ночью $nightTemp°C. Осадки: $precipitationText")
    }
}

const val CELSIUS_TO_KELVIN = 273

fun main() {
    val sunday = WeatherEveryDay(300, 273, true)
}