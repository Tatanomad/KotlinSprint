package lesson_5

fun main() {
    println("Введите имя")
    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    val inputName = readln()

    if (userName == inputName) {
        println("Введите пароль")
        val inputPassword = readln()
        if (userPassword == inputPassword) {
            println("Добро пожаловать, $userName!")
        } else
            println("Пароль не совпадает")
    } else {
        println("Пользователь не найден. Зарегистрируемся?")
    }

}