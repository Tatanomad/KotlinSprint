package lesson_13

class MyContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("Имя:$name, Номер телефона:$phoneNumber, Компания: $company")
    }
}

fun main() {
    val contacts = mutableListOf<MyContact>()
    println("Заполним контакт. Напиши \"стоп\" в поле имени, чтобы выйти")
    while (true) {
        println("Введите имя")
        val newName = readln()
        if (newName.lowercase() == "стоп") break
        println("Введите номер телефона")
        val newPhoneNumber = readln().toLongOrNull()
        if (newPhoneNumber == null) {
            println("Номер телефона не введен, запись не добавлена")
            continue
        }
        println("Введите название компании")
        val inputCompany = readln()
        val newCompany = inputCompany.ifBlank { null }

        val newContact = MyContact(newName, newPhoneNumber, newCompany)
        contacts.add(newContact)
    }
    contacts.forEach { it.printContactInfo() }

}