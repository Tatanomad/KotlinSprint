package lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun isPasswordCorrect(input: String): Boolean {
        return input == password
    }
}

fun main() {
    val user = User("admin_ivan", "Secret123")

    println("Пользователь: ${user.login}")

    val check1 = user.isPasswordCorrect("Secret123")
    println("Пароль верен: $check1")

    val check2 = user.isPasswordCorrect("12345")
    println("Пароль верен: $check2")

}
