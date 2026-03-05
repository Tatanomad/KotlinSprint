package lesson_15

abstract class Warehouse(val name: String, val amount: Int)

interface SearchInstrument {
    fun searchForInstrument()
}

class MusicalInstrument(name: String, amount: Int) : Warehouse(name, amount), SearchInstrument {
    override fun searchForInstrument() {
        println("Выполняется поиск")
    }
}

class Components(name: String, amount: Int) : Warehouse(name, amount)

fun main() {
    val violin = MusicalInstrument("Скрипка", 5)
    violin.searchForInstrument()
}