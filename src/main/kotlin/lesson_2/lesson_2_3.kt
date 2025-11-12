package lesson_2

fun main() {
    var departureHour = 9
    var departureMinute = 39
    var travelDurationInMinutes = 457

    val departureTimeInMinutes =
        departureHour * TOTAL_MINUTES_IN_HOUR + departureMinute // переводим время отправления в минуты
    val arrivalTimeInMinutes = departureTimeInMinutes + travelDurationInMinutes // считаем время прибытия в минутах
    val minutesInADay = 24 * 60 //всего минут в сутках

    val actualArrivalMinutesInDay =
        arrivalTimeInMinutes % minutesInADay //учитываем переход через сутки, чтобы не получить, например, такое время прибытия 27:12

    val arrivalHour = actualArrivalMinutesInDay / TOTAL_MINUTES_IN_HOUR //час прибытия
    val arrivalMinute = actualArrivalMinutesInDay % TOTAL_MINUTES_IN_HOUR //минуты прибытия
    val formattedTime = "%02d:%02d".format(arrivalHour, arrivalMinute)

    println("$formattedTime")

}

const val TOTAL_MINUTES_IN_HOUR = 60