package lesson_4

fun main() {
    val weight = 50
    val volume = 100
    val comparisonResult = (weight > MIN_WEIGHT && weight <= MAX_WEIGHT) && (volume < MAX_VOLUME)
    println("Груз с весом $weight кг и объемом $volume л соответствует категории \'Average\':$comparisonResult")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100