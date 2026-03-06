package lesson_15

abstract class WeatherStationStats {
    abstract fun description()
}

class Temperature(val degrees: Double) : WeatherStationStats() {
    override fun description() {
        println("Зафиксированная температура: $degrees C°")
    }
}

class PrecipitationAmount(val millimeters: Double, val type: String) : WeatherStationStats() {
    override fun description() {
        println("Зафиксированы осадки: $type в количестве $millimeters мм")
    }
}

class WeatherServer() {
    fun sendData(stats: WeatherStationStats) {
        println("Отправка данных на сервер...")
        stats.description()
    }
}

fun main() {
    val sendStat = WeatherServer()
    val sendTemp = Temperature(25.0)
    val sendPrecipitation = PrecipitationAmount(10.5, "дождь")

    sendStat.sendData(sendTemp)
    sendStat.sendData(sendPrecipitation)

}