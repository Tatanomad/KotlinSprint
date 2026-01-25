package lesson_4

fun main() {
    println("Имеет ли корабль повреждения?")
    val isStarshipDamaged = readln().toBoolean()
    println("Численность команды")
    val crewSize = readln().toInt()
    println("Погода благоприятная?")
    val isTheWeatherFine = readln().toBoolean()
    println("Сколько провизии?")
    val amountOfProvision = readln().toInt()
    val shipVoyage =
        (!isStarshipDamaged && crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE && isTheWeatherFine && amountOfProvision > AMOUNT_OF_PROVISIONS) || (isStarshipDamaged && crewSize == MAX_CREW_SIZE && isTheWeatherFine && amountOfProvision >= AMOUNT_OF_PROVISIONS)

    println("Может ли корабль отправиться в плавание? $shipVoyage")
}

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val AMOUNT_OF_PROVISIONS = 50