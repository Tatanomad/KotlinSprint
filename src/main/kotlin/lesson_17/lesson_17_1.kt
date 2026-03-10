package lesson_17

class QuizElement(
    question: String,
    answer: String,
) {
    val question = question
        get() = field
    var answer = answer
        set(value) {
            field = value
        }
}