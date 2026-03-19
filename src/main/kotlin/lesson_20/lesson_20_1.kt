package lesson_20

fun main() {
    val greeting: (String) -> String = { username ->
        "С наступающим Новым Годом, $username!"
    }

    val message = greeting("Алексей")
    println(message)
}

