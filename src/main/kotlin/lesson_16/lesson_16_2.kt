package lesson_16

class Round(private val radius: Double) {
    private val pi: Double = 3.14
    fun circumference() = 2 * pi * radius
    fun circleArea() = pi * radius * radius
}

fun main() {
    val formula = Round(15.0)
    val circumference = formula.circumference()
    val area = formula.circleArea()
    println("Длина окружности равна $circumference. Площадь круга: $area")
}