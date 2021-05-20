package lesson_11

class Car {
    var color:String =""
    var engine:String=""
    var doors:Int= 0
}
class CarTest{
    fun doorsChange (door:Int): Int {
       // door = this.
        return door
    }
    fun Change (color:String,Engine:String){
        var color = color
        var Engine = Engine
        var change = color
        color = Engine
        Engine = change
    }
}
fun main(args: Array<String>) {
    var C1 = CarTest()
    var C2 = Car()
    println("Количество дверей в авто - " + C2.doors)
    println("Новое количество дверей в авто - " + C1.doorsChange(2))
    println("Смена " +C1.Change("white","v6").toString())

}