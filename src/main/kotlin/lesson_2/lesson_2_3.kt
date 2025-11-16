package lesson_2

fun main() {
    var departureHour = 9
    var departureMinute = 39
    var travelDurationInMinutes = 457

    val departureTimeInMinutes = departureHour * TOTAL_MINUTES_IN_HOUR + departureMinute
    val arrivalTimeInMinutes = departureTimeInMinutes + travelDurationInMinutes
    val minutesInADay = TOTAL_HOURS_IN_A_DAY * TOTAL_MINUTES_IN_HOUR
    val actualArrivalMinutesInDay = arrivalTimeInMinutes % minutesInADay
    val arrivalHour = actualArrivalMinutesInDay / TOTAL_MINUTES_IN_HOUR
    val arrivalMinute = actualArrivalMinutesInDay % TOTAL_MINUTES_IN_HOUR
    val formattedTime = "%02d:%02d".format(arrivalHour, arrivalMinute)

    println("$formattedTime")
}

const val TOTAL_MINUTES_IN_HOUR = 60
const val TOTAL_HOURS_IN_A_DAY = 24