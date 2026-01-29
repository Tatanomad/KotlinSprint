package lesson_5

fun main() {
    println("Введите расстояние поездки в километрах")
    val travelDistance = readln().toFloat()
    println("Введите расход топлива на 100 км (в литрах)")
    val fuelConsumption = readln().toFloat()
    println("Введите текущую цену за литр топлива")
    val fuelCost = readln().toFloat()
    val totalFuelConsumption = travelDistance*fuelConsumption/ FUEL_PER_100_KM
    val totalFuelCost = totalFuelConsumption*fuelCost

    println("Итоговая стоимость поездки: ${"%.2f".format(totalFuelCost)} рублей, " +
            "общее количество необходимого топлива: ${"%.2f".format(totalFuelConsumption)} литров")
}
const val FUEL_PER_100_KM = 100