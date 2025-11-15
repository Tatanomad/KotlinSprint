package lesson_4

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9
    val availableToday: Boolean = bookedToday < TOTAL_TABLES
    val availableTomorrow: Boolean = bookedTomorrow < TOTAL_TABLES
    val reservationResult = "[Доступность столиков на сегодня: $availableToday],\n" +
            "[Доступность столиков на завтра: $availableTomorrow]"
    println(reservationResult)

}

const val TOTAL_TABLES = 13