package lesson_5

import kotlin.math.pow

fun main() {
    println("Введите вес в килограммах")
    val inputWeight = readln().toFloat()
    println("Введите рост в сантиметрах")
    val inputHeight = readln().toFloat()
    val heightToMeter: Float = inputHeight / CM_IN_METER
    val bmi = inputWeight / heightToMeter.pow(2)
    when {
        bmi < 18.5 -> println("Недостаточная масса тела")
        bmi in 18.5..25.0 -> println("Нормальная масса тела")
        bmi >= 25 && bmi < 30 -> println("Избыточная масса тела")
        bmi > 30.0 -> println("Ожирение")
    }
    println("Ваш ИМТ: ${"%.2f".format(bmi)}")
}

const val CM_IN_METER = 100