package lesson_7

fun main() {

    var password = ""
    for (i in 0..5) {
        if (i % 2 == 0) {
            password += ('a'..'z').random()
        } else {
            password += (0..9).random()
        }
    }
    println("Ваш шестизначный пароль: $password")
}