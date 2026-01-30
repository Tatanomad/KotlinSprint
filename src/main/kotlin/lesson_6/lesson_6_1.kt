package lesson_6

fun main() {

    println("Придумайте логин")
    val inputLogin = readln()
    println("Придумайте пароль")
    val inputPassword = readln()
    var userLogin = ""
    var userPassword = ""

    while (userLogin != inputLogin || userPassword != inputPassword) {
        println("Авторизация")
        println("Введите логин")
        userLogin = readln()
        println("Введите пароль")
        userPassword = readln()
        if (userLogin != inputLogin || userPassword != inputPassword)
            println("Ошибка. Попробуйте еще раз")
    }
    println("Авторизация прошла успешно")

}