package lesson_4

fun main() {
    val isSunnyWeather: Boolean = true
    val isTentOpened:Boolean = true
    val humidity:Int = 20
    val season:String = "зима"
    val favorableConditions = isSunnyWeather && IS_SUNNY_WEATHER && isTentOpened && IS_TENT_OPENED && humidity == HUMIDITY && season != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPENED = true
const val HUMIDITY = 20
const val SEASON = "зима"