fun main() {
    // Практическая работа №1: Числа в диапазоне
    val a = 5
    val b = 8
    val min = minOf(a, b)
    val max = maxOf(a, b)
    val rangeList = (min..max).toList()
    println("Массив: ${rangeList.joinToString(", ")}")

    // Практическая работа №2: Создание и вывод массива
    val list = mutableListOf<Int>()
    list.addAll(listOf(8, 21, 5, 90, 11, 0))
    list.add(0, 90)
    list.removeAt(4)
    list.add(-35)
    println("Итоговый массив: ${list.joinToString(", ")}")

    // Практическая работа №3: Минимум и максимум
    val data = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val minVal = data.minOrNull()
    val maxVal = data.maxOrNull()
    println("Минимальный элемент: $minVal")
    println("Максимальный элемент: $maxVal")

    // Практическая работа №4: Почти самый маленький
    val array = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val sorted = array.sorted()
    val secondMin = sorted.getOrElse(1) { "Нет второго минимального" }
    println("Второй минимальный элемент: $secondMin")

    // Практическая работа №5: Сортировка массива
    val sortData = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val sortedList = sortData.sorted()
    println("Отсортированный массив: ${sortedList.joinToString(", ")}")

    // Практическая работа №6: Среднее арифметическое
    val numbers = listOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)
    val average = numbers.average()
    val aboveAverage = numbers.filter { it > average }
    println("Среднее арифметическое: $average")
    println("Элементы больше среднего: ${aboveAverage.joinToString(", ")}")
}