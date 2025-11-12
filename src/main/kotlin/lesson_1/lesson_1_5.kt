package lesson_1

fun main() {
    val totalSecInSpace = 6480
    val hoursInSpace = totalSecInSpace / TOTAL_SEC_IN_HOUR  //считаем количество часов в космосе
    val remainingSecondsAfterHours =
        totalSecInSpace % TOTAL_SEC_IN_HOUR  //записываем остаток секунд после вычисления часов
    val minutesInSpace =
        remainingSecondsAfterHours / TOTAL_SEC_IN_MINUTE  //считаем целое количество минут в космосе из оставшихся секунд
    val secondsInSpace = remainingSecondsAfterHours % TOTAL_SEC_IN_MINUTE  //записываем остаток секунд после деления
    val formattedTime = "%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace)
    println("$formattedTime")
}

const val TOTAL_SEC_IN_HOUR = 3600
const val TOTAL_SEC_IN_MINUTE = 60