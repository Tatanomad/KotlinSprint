package lesson_13

class PhBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("Имя:$name, Номер телефона:$phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = listOf(
        PhBook("Алиса", 89234567898),
        PhBook("Игорь", 89235679878),
        PhBook("Маша", 89458769012, "null"),
        PhBook("Саша", 89537861234, "Google"),
        PhBook("Василий Петрович", 89131234567, "ТСЖ")
    )
    println("Список компаний: ${contacts.mapNotNull { it.company }}")
}
