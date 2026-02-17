package lesson_10

fun main() {
    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPassword = readln()
    val token = authorizationToken(inputLogin, inputPassword)
    if (token != null) {
        getCart(token)
    } else println("Ошибка авторизации")

}

const val LOGIN = "Harry Potter"
const val PASSWORD = "12345"

fun authorizationToken(inputLogin: String, inputPassword: String): String? {
    if (inputLogin == LOGIN && inputPassword == PASSWORD) {
        val range1 = 'a'..'z'
        val range2 = 0..9
        return (range1.toList() + range2.toList()).shuffled<Any>().toString()
    } else return null
}

fun getCart(token: String) {
    val shoppingCart = listOf("Платье арт.123", "Шорты арт.345", "Футболка арт.789")
    return shoppingCart.forEach { println(it) }
}