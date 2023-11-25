import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    println("Введите вашу фамилию")
    val surname = readlnOrNull()
    println("Введите ваше имя")
    val name = readlnOrNull()
    println("Введите ваше отчество")
    val middleName = readlnOrNull()

    println(
        "Фамилия: $surname\n" +
        "Имя: $name\n" +
        "Отчество: $middleName"
    )
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    if (a.equals(0.0)) {
        throw IllegalArgumentException("Параметр a равен нулю, уравнение не является квадратным")
    }

    val discriminant = b * b - 4 * a * c;

    if (discriminant.compareTo(0.0) < 0) {
        throw IllegalArgumentException("Дискриминант меньше нуля, уравнение не имеет корней")
    }

    val firstVal = (-b + sqrt(discriminant)) / (2 * a)
    val secondVal = (-b - sqrt(discriminant)) / (2 * a)
    return firstVal to secondVal
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (i in '1'..'9') {
        println("$i$i$i")
    }

    // Или

    for (i in 100..999) {
        if (i % 10 == i / 10 % 10 && i / 100 == i % 10) {
            println(i)
        }
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}