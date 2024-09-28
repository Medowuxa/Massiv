fun main() {
    // Ввод массива слов
    println("Введите слова через запятую:")
    val input = readLine() ?: ""
    val words = input.split(",").map { it.trim() } // Разделяем слова и убираем лишние пробелы

    // Создаем пустую карту для группировки слов
    val groupedWords = mutableMapOf<String, MutableList<String>>()

    // Группируем слова
    for (word in words) {
        // Сортируем буквы в слове и создаем ключ
        val key = word.toCharArray().sorted().joinToString("")

        // Добавляем слово в соответствующую группу
        if (groupedWords.containsKey(key)) {
            groupedWords[key]?.add(word)
        } else {
            groupedWords[key] = mutableListOf(word)
        }
    }

    // Выводим группы слов
    for (group in groupedWords.values) {
        println(group.joinToString(", "))
    }
}
