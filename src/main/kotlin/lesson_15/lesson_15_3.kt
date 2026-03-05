package lesson_15

abstract class ForumUsers(val name: String, val role: String) {
    fun readMsg() {
        println("$role $name читает ветку")
    }

    fun writeMsg(text: String) {
        println("$role $name оставил сообщение: $text")
    }
}

class RegularUser(name: String, val userId: Int) : ForumUsers(name, "Пользователь")

class Admin(name: String) : ForumUsers(name, "Админ") {
    fun deleteMsg(msgId: Int) {
        println("$role удалил сообщение $msgId")
    }

    fun deleteUser(userId: Int) {
        println("$role удалил юзера с id $userId")
    }
}

fun main() {
    val user = RegularUser("Василий Иванович", 123)
    val admin = Admin("Алексей")

    user.readMsg()
    user.writeMsg("Всем привет!")

    admin.deleteMsg(321)
}