package lesson_11

data class User(
    val id: String,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {
    val user1 = User(id = "Harry Potter", login = "Potter", password = "12345", email = "hp@gmail.com")
    println("$user1")
    val user2 = User(id = "Ron Weasley", login = "Weasley", password = "54321", email = "rw@gmail.com")
    println("$user2")
}