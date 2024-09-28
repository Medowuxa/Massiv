fun main() {
    val arr = Array(5) { IntArray(5) }

    // Ввод массива
    println("Введите элементы массива (5 строк и 5 столбцов):")
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            print("Элемент [$i][$j]: ")
            arr[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Проверка на симметричность
    var s = true

    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (arr[i][j] != arr[j][i]) {
                s = false
                break
            }
        }
        if (!s) break
    }

    // Вывод результата
    if (s) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}
