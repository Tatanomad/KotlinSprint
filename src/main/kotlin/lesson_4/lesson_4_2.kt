package lesson_4

fun main() {
    val weight = 20
    val volume = 80

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории \'Average\':${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории \'Average\':${weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT && volume2 < MAX_VOLUME}")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100