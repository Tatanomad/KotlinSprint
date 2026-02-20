package lesson_11

class Member(
    val nickname: String,
    val avatarUrl: String,
    var status: String,
)

class Room(
    val coverUrl: String,
    val id: String,
) {
    var listOfMembers = mutableListOf<Member>()

    fun addMember(newMember: Member) {
        listOfMembers.add(newMember)
        println("Добавлен участник:${newMember.nickname}")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        for (i in listOfMembers) {
            if (i.nickname == nickname) {
                i.status = newStatus
                return println("Статус пользователя $nickname изменен на: $newStatus")

            }
        }
    }

}

fun main() {
    val weatherRoom = Room(coverUrl = "weatherRoom.png", id = "12345")
    val user1 = Member("Алиса", "pic.png", "микрофон выключен")
    val user2 = Member("Вова", "pic1.png", "разговаривает")
    weatherRoom.addMember(user1)
    weatherRoom.updateStatus("Алиса", "разговаривает")

}


