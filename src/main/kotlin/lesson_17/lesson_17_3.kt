package lesson_17

class Folder(
    val name: String,
    val filesQuantity: Int,
    val secretFlag: Boolean,

    ) {
    val folderName
        get() = if (secretFlag) "скрытая папка" else name

    val filesCount: Int
        get() = if (secretFlag) 0 else filesQuantity

}

fun main() {
    val checkFolder = Folder("личное", 15, false)
    println("Название папки: ${checkFolder.folderName}, количество файлов: ${checkFolder.filesCount}")
}