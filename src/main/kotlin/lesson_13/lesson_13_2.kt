package lesson_13

class Contact(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printContactInfo() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = Contact("Ростислав", 89123456789)
    phoneBook.printContactInfo()
}