package lesson_2

fun main() {
    var crystallineOre = 7
    var ironOre = 11
    val bonusPercent = 20

    val crystalBonus = (crystallineOre * bonusPercent) / CONVERTING_TO_A_PERCENTAGE
    val ironBonus = (ironOre * bonusPercent) / CONVERTING_TO_A_PERCENTAGE

    println("Бонусная кристаллическая руда: $crystalBonus")
    println("Бонусная железная руда: $ironBonus")
}

const val CONVERTING_TO_A_PERCENTAGE = 100