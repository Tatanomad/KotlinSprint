package lesson_1

fun main() {
    val totalSecInSpace = 6480
    val hoursInSpace = totalSecInSpace / TOTAL_SEC_IN_HOUR
    val remainingSecondsAfterHours = totalSecInSpace % TOTAL_SEC_IN_HOUR
    val minutesInSpace = remainingSecondsAfterHours / TOTAL_SEC_IN_MINUTE
    val secondsInSpace = remainingSecondsAfterHours % TOTAL_SEC_IN_MINUTE
    val formattedTime = "%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace)
    println("$formattedTime")
}

const val TOTAL_SEC_IN_HOUR = 3600
const val TOTAL_SEC_IN_MINUTE = 60