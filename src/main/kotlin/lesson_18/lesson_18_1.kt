package lesson_18

class Order(val orderNumber: Int) {

    fun printOrderInfo(item: String) {
        println("Заказ №$orderNumber. Товар: $item")
    }

    fun printOrderInfo(items: List<String>) {
        val itemsString = items.joinToString(", ")
        println("Заказ №$orderNumber. Заказаны следующие товары: $itemsString")
    }
}

fun main() {
    val singleOrder = Order(101)
    singleOrder.printOrderInfo("Смартфон")

    val multiOrder = Order(102)
    val cart = listOf("Ноутбук", "Мышь", "Коврик")
    multiOrder.printOrderInfo(cart)
}
