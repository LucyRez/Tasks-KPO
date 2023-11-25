/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {

    val newValue = "blahblah"

    val el = array.groupBy { it }.mapValues { it.value.size }

    return array.map { if (el[it]!! > 1) newValue else it }
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {

    val words = text.split(" ")
    val el = words.groupBy { it }.mapValues { it.value.size }
    return el.count { it.value == 1 }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "ab ab c d"
    println(uniqueWords(text))

    print(replaceElements(text.split(" ")).joinToString(" "))
}