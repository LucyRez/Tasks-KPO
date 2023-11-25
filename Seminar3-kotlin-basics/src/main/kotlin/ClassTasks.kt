/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val x: Double, val y: Double) {

    open val area: Double = 0.0

    fun display() {
        println("S = $area, X = $x, Y = $y")
    }
}

class Circle(x: Double, y: Double, val r: Double) : Point(x, y) {
    override val area = Math.PI * r * r;
}

class Square(x: Double, y: Double, val a: Double) : Point(x, y) {
    override val area = a * a;
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}