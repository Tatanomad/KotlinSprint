package lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculatingTheArea(): Double
    abstract fun perimeterCalculation(): Double
}

class Round(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculatingTheArea(): Double = PI * radius * radius

    override fun perimeterCalculation(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun calculatingTheArea(): Double = width * height

    override fun perimeterCalculation(): Double = 2 * (width + height)
}

fun main() {
    val figures: List<Figure> = listOf(
        Round("черный", 5.0),
        Round("белый", 10.0),
        Rectangle("черный", 4.0, 6.0),
        Rectangle("белый", 3.0, 8.0),
        Rectangle("черный", 10.0, 2.0)
    )

    val blackPerimetersSum = figures
        .filter { it.color.lowercase() == "черный" }
        .sumOf { it.perimeterCalculation() }

    val whiteAreaSum = figures
        .filter { it.color.lowercase() == "белый" }
        .sumOf { it.calculatingTheArea() }
    println("Сумма периметров всех черных фигур: ${"%.2f".format(blackPerimetersSum)}")
    println("Сумма площадей всех белых фигур: ${"%.2f".format(whiteAreaSum)}")

}