package parametTest;


fun main(args: Array<String>) {

     var persi = pers("1", "2")
    println(persi)
}
class pers <T> {
    var value:T = TODO()
    var Value2:T = TODO()

    constructor(value: T, Value2: T) {
        this.value = value
        this.Value2 = Value2
    }





    @Override
    override fun toString(): String {
        return "pers(value=$value, Value2=$Value2)"
    }
}
