package lesson_16



class Car {

    var color = "Yellow"
var engine = ""

    constructor(color: String, engine: String) {
        this.color = color
        this.engine = engine
    }

    fun abc (cvet:String):Car{
        var c10 = Car(cvet, "V6")
        return c10

    }

}
fun main(args:Array<String>){
   var c = Car("Red", "V6")
     var c2 = c.abc("black")
    println(c.color)
   c = c2
    println(c2.color)
    println(c == c2)
    var st = "privet moi drug"
    println(st[2])
        // println(st.indexOf("moi"))
}