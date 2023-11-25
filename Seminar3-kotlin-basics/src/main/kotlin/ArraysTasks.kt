
/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    println("Введите кол-во элементов массива")
    val n = readln().toInt()
    println("Введите элементы массива")
    val result = Array(n) {0}
    for (i in 0 until n) {
        result[i] = readln().toInt()
    }

    result.forEach { println(it) }
    return result
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    arr.forEach { println(it) }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()

    sortArrayDesc(arr)
}

