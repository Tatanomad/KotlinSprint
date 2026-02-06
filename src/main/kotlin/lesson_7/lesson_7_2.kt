package lesson_7

fun main() {

    for (i in 1..100) {
        var authCode = (1000..9999).random()
        println("Ваш код авторизации: $authCode")
        println("Введите код")
        var inputCode = readln().toInt()
        if (authCode == inputCode) {
            println("Авторизация прошла успешно ")
            break
        }
        println("Ошибка. Попробуйте еще раз")
    }
}