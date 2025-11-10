package lesson_1

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60
    println("$hours:$minutes:$seconds")

}