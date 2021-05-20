package lesson_9
import lesson_8.*


fun main(args: Array<String>){
var car = CAR()
    car.abc(5)
    var per = Pervii()
    per.QWERT(4.2)

}
class CAR{

    var a = 1
  companion object {var b = 2}
    fun abc(c:Int){
        println(a)
        println(b)
        println(c)
    }
}