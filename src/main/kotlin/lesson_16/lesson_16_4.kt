package lesson_16

private class Order(
    private val orderNumber: Int,
    var status: String = "Новый",
) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun changeStatusRequest(newStatus: String) {
        println("Заявка отправлена менеджеру.")
        changeStatus(newStatus)
    }

    fun printStatusInfo(orderNumber: Int) {
        println("Новый статус заказа №$orderNumber: $status")
    }
}

fun main() {
    val userOrder = Order(123)
    userOrder.changeStatusRequest("В пути")
    userOrder.printStatusInfo(123)
}