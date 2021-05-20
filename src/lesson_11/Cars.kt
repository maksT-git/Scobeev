package lesson_11



class Cars {
    var color = ""
    var motor = ""
    var doors:Int = 1
    constructor (c: Cars, w: Cars){

    }

}
class CarsTest{
    fun changeDoor(c:Cars, doors:Int){
        c.doors = doors

    }
    fun chargeColor(q:Cars, w:Cars){
        var COLOR:String = q.color
        q.color = w.color
        w.color = COLOR

    }

}






