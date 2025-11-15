package lesson_3

fun main() {
    var userFirstName = "Татьяна"
    var userLastName = "Андреева"
    var userPatronymic = "Сергеевна"
    var userAge = 20
    println("$userLastName $userFirstName $userPatronymic,$userAge")
    userAge = 22
    userLastName = "Сидорова"
    println("$userLastName $userFirstName $userPatronymic,$userAge")
}