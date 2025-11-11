package lesson_2

fun main() {
    var crystallineOre = 7
    var ironOre = 11
    val bonusPercent = 20 // Размер бонуса в процентах

    val crystalBonus = (crystallineOre * bonusPercent) / 100  // Расчет бонусного количества кристаллической руды
    val ironBonus = (ironOre * bonusPercent) / 100 // Расчет бонусного количества железной руды

    println("Бонусная кристаллическая руда: $crystalBonus")
    println("Бонусная железная руда: $ironBonus")
}