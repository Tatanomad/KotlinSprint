package lesson_15

interface FlyingCreature {
    fun fly()
}

interface SwimmingCreatures {
    fun swim()
}

class Duck(val name: String) : FlyingCreature, SwimmingCreatures {
    override fun fly() {
        println("$name умеет летать")
    }

    override fun swim() {
        println("$name также умеет плавать")
    }

}

class Gull(val name: String) : FlyingCreature, SwimmingCreatures {
    override fun fly() {
        println("$name парит над морем")
    }

    override fun swim() {
        println("$name плавает по поверхности моря")
    }
}

class Crucian(val name: String) : SwimmingCreatures {
    override fun swim() {
        println("$name умеет только плавать")
    }
}

fun main() {
    val yellowDuck = Duck("Утка")
    val seaGull = Gull("Чайка")
    val crucian = Crucian("Карась")
    yellowDuck.fly()
    yellowDuck.swim()

    seaGull.fly()
    seaGull.swim()

    crucian.swim()
}