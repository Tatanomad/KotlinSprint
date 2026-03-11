package lesson_17

class Package(
    val packageNumber: Int,
    val currentLocation: String,
) {
    var counter = 0
    var location = currentLocation
        set(value) {
            if (field != value)
                field = value
            counter++

        }
}

fun main() {
    val parcel = Package(123, "Склад")

    parcel.location = "Сортировочный центр"
    parcel.location = "Склад Химки"

    println("Текущее местоположение: ${parcel.location}. Количество перемещений: ${parcel.counter}")
}