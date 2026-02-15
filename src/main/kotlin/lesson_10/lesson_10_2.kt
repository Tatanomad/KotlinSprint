package lesson_10

fun main() {
    print("Придумайте логин: ")
    val login = readln()
    print("Придумайте пароль: ")
    val password = readln()

    if (isValid(login) && isValid(password))
        println("Добро пожаловать!")
    else
        println("Логин или пароль недостаточно длинные.")
}

fun isValid(text: String): Boolean {
    return text.length >= 4
}