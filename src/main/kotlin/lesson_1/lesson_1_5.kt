package lesson_1

fun main() {

    val remainingSecondsAfterHours = TOTAL_SEC_IN_SPACE % 3600
    val minutesInSpace = remainingSecondsAfterHours / 60
    val secondsInSpace = remainingSecondsAfterHours % 60
    val formattedTime = "%02d:%02d:%02d".format(HOURS_IN_SPACE, minutesInSpace, secondsInSpace)
    println("$formattedTime")
}

const val TOTAL_SEC_IN_SPACE = 6480
const val HOURS_IN_SPACE = TOTAL_SEC_IN_SPACE / 3600