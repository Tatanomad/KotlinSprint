package lesson_14

open class MainVessel(
    val name: String,
    val speed: Int,
    val liftingCapacity: Int,
    val capacity: Int,
    val chopIce: Boolean = false,
) {
    open fun loadingMethod() {
        println("$name начал погрузку")
    }
}

class ShipLiner(name: String) :
    MainVessel(name = name, 50, 5000, 5000) {
    override fun loadingMethod() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }
}

class ShipCargo(name: String) :
    MainVessel(name = name, 20, 100000, 30) {
    override fun loadingMethod() {
        println("$name активирует погрузочный кран")
    }
}

class ShipIcebreaker(name: String) :
    MainVessel(name = name, 10, 2000, 10, chopIce = true) {
    override fun loadingMethod() {
        println("$name открывает ворота со стороны кормы")
    }
}

fun main() {
    val superLiner = ShipLiner("Титаник")
    superLiner.loadingMethod()

    val bigCargo = ShipCargo("Тягач")
    bigCargo.loadingMethod()

    val greatIcebreaker = ShipIcebreaker("Камчатка")
    greatIcebreaker.loadingMethod()
}

