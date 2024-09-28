fun main() {
    val nums = mutableSetOf<Char>()

    println("Введите количество строк:")
    val rows = readLine()?.toIntOrNull() ?: return println("Ошибка ввода")

    println("Введите количество столбцов:")
    val cols = readLine()?.toIntOrNull() ?: return println("Ошибка ввода")

    val arr = Array(rows) { IntArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            while (true) {
                println("Введите трехзначное число для элемента [$i][$j]:")
                val num = readLine()?.toIntOrNull()
                if (num == null || num !in 100..999) {
                    println("Ошибка ввода. Введите трехзначное число.")
                } else {
                    arr[i][j] = num
                    nums.addAll(num.toString().toCharArray().map { it })
                    break // Выход из цикла, если ввод корректен
                }
            }
        }
    }

    println("Двумерный массив:")
    for (row in arr) {
        println(row.joinToString(" "))
    }

    println("В массиве использовано ${nums.size} различных цифр.")
}
