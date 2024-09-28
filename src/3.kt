fun main() {
    val alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ"
    val alphabetList = alphabet.toList()

    println("Выберите действие: шифровать (1) или дешифровать (2):")
    val choice = readLine()?.toIntOrNull()

    println("Введите ключевое слово:")
    val keyWord = readLine()?.toUpperCase() ?: return println("Ошибка ввода")

    println("Введите текст:")
    val text = readLine()?.toUpperCase() ?: return println("Ошибка ввода")

    val result = StringBuilder()

    for ((index, char) in text.withIndex()) {
        val shift = alphabetList.indexOf(keyWord[index % keyWord.length])
        val charIndex = alphabetList.indexOf(char)

        if (charIndex != -1) {
            val newIndex = if (choice == 1) {
                (charIndex + shift) % alphabetList.size
            } else {
                (charIndex - shift + alphabetList.size) % alphabetList.size
            }
            result.append(alphabetList[newIndex])
        } else {
            result.append(char) // Неизвестные символы остаются без изменений
        }
    }

    println("${if (choice == 1) "Зашифрованный" else "Расшифрованный"} текст: $result")
}
