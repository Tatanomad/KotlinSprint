package lesson_2

fun main() {
    var departureHour = 9 //выбрала var, тк время будет меняться
    var departureMinute = 39
    var travelDurationInMinutes = 457

    val departureTimeInMinutes = departureHour * 60 + departureMinute // переводим время отправления в минуты
    val arrivalTimeInMinutes = departureTimeInMinutes + travelDurationInMinutes // считаем время прибытия в минутах
    val minutesInADay = 24 * 60 //всего минут в сутках

    val actualArrivalMinutesInDay =
        arrivalTimeInMinutes % minutesInADay //учитываем переход через сутки, чтобы не получить, например, такое время прибытия 27:12

    val arrivalHour = actualArrivalMinutesInDay / 60 //час прибытия
    val arrivalMinute = actualArrivalMinutesInDay % 60 //минуты прибытия
    val formattedTime = "%02d:%02d".format(arrivalHour, arrivalMinute)

    println("$formattedTime")

}