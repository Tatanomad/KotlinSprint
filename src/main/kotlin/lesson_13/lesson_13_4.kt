package lesson_13

class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("Имя:$name, Номер телефона:$phoneNumber, Компания: $company")
    }
}

fun main() {
    val contacts = mutableListOf<PhoneBook2>()
    println("Введите имя")
    val newName = readln()
    println("Введите номер телефона")
    val newPhoneNumber = readln().toLongOrNull()
    if (newPhoneNumber == null)
        println("Номер телефона не введен, запись не добавлена")
    else {
        println("Введите название компании")
        val inputCompany = readln()
        val newCompany = if (inputCompany.isBlank()) null
        else inputCompany

        val newContact = PhoneBook2(newName, newPhoneNumber, newCompany)
        contacts.add(newContact)
        contacts.forEach { it.printContactInfo() }

    }
}