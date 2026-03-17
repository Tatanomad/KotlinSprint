package lesson_19

enum class Category {
    CLOTHES,
    OFFICE_SUPPLIES,
    OTHER;

    fun printCategoryName(): String {
        return when (this) {
            CLOTHES -> ("Одежда")
            OFFICE_SUPPLIES -> ("Канцелярские товары")
            OTHER -> ("Другое")
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printProductInfo() {
        println("Название: $name, категория: ${category.printCategoryName()}")
    }
}

fun main() {
    val dress = Product("Платье в горох", 10923, Category.CLOTHES)
    val pencil = Product("Простой карандаш", 10789, Category.OFFICE_SUPPLIES)
    dress.printProductInfo()
    pencil.printProductInfo()
}