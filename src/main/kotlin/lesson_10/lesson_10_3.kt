package lesson_10

fun main() {
    println("Какой длины будет ваш пароль?")
    val passwordLength = readln().toInt()
    val password = passwordGenerator(passwordLength)
    println("Ваш пароль: $password")
}

fun passwordGenerator(passwordLenght: Int): String {
    var password = ""
    val rangeNumbers = 0..9
    val rangeSimbols = '!'..'/'
    for (i in 0 until passwordLenght) {
        if (i % 2 == 0)
            password += rangeNumbers.random()
        else {
            password += rangeSimbols.random()
        }
    }
    return password

}