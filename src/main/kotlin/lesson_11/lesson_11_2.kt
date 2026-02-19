package lesson_11

data class User2(
    val id: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUserInfo() {
        println("Пользователь: $id, Bio: $bio, Email:$email, пароль:$password")
    }

    fun inputBio() {
        println("Заполните информацию о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Введите пароль")
        val passwordToCompare = readln()
        if (passwordToCompare == password)
            println("Введите новый пароль")
        password = readln()
        println("Пароль изменен")

    }
}

fun main() {

    val changeBioAndPassword: User2 = User2(
        id = "Harry Potter",
        login = "Potter",
        password = "12345",
        email = "hp@gmail.com"
    )
    changeBioAndPassword.inputBio()
    changeBioAndPassword.changePassword()
    changeBioAndPassword.printUserInfo()
}