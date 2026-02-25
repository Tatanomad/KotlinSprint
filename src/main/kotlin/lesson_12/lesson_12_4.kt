package lesson_12

class WeatherEveryDay(var dayTemp: Int, var nightTemp: Int, var hasPrecipitation: Boolean) {

    var dayKelvin:Int = 0
    var nightKelvin:Int = 0

    init {
        dayKelvin = dayTemp - CELSIUS_TO_KELVIN
        nightKelvin = nightTemp - CELSIUS_TO_KELVIN
        printWeather()
    }

    fun printWeather() {
        val precipitationText = if (hasPrecipitation) "Ожидаются" else "Не ожидаются"
        println("Погода: днем ${dayKelvin}°C, ночью ${nightKelvin}°C. Осадки: $precipitationText")
    }
}

const val CELSIUS_TO_KELVIN = 273

fun main() {
    val sunday = WeatherEveryDay(300, 273, true)
}