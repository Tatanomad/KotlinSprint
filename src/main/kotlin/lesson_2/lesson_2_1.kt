package lesson_2

fun main() {
    var grade1: Float = 3.0f //выбрала var, тк если это часть школьного софта, то оценки могут меняться
    var grade2: Float = 4.0f
    var grade3: Float = 3.0f
    var grade4: Float = 5.0f
    val arithmeticMean: Float = (grade1 + grade2 + grade3 + grade4) / 4
    println(arithmeticMean)
}