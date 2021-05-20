package lesson_8
fun main ()
{
var qwe = Pervii()
   qwe.QWERT(5.1)
}
class Pervii {
    fun QWE(radius: Double): Double {
        var S = Pi * radius * radius
        return S
    }
    companion object {
        val Pi = 3.14
    }
    fun QWER(radius: Double):Double {
        var L = 2 * Pi * radius
        return L
}
    fun QWERT(radius: Double) {
        println("Вы ввели радиус = $radius мм")
        println("Площадь: ${QWE(radius)} мм")
        println("Длинна: ${QWER(radius)} мм")
    }
}

