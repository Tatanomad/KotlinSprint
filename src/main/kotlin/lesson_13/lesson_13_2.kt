package lesson_13

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("Имя:$name, Номер телефона:$phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = PhoneBook("Ростислав", 89123456789)
    phoneBook.printContactInfo()
}