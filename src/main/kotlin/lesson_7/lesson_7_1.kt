package lesson_7

fun main() {
    val range1 = 'a'..'z'
    val range2 = 0..9
    var password = ""
    for (i in 0..5) {
        if (i % 2 == 0) {
            password += range1.random()
        } else {
            password += range2.random()
        }
    }
    println("Ваш шестизначный пароль: $password")
}