package lesson_3

fun main() {
    val userFirstName = "Татьяна"
    var userLastName = "Андреева"
    val userPatronymic = "Сергеевна"
    var userAge = 20
    println("$userLastName $userFirstName $userPatronymic,$userAge")
    userAge = 22
    userLastName = "Сидорова"
    println("$userLastName $userFirstName $userPatronymic,$userAge")
}