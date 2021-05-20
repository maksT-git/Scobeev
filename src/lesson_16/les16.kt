package lesson_16

class les16 {
    fun email (s:String){
        var a = 0
        var b = 0
        var c = 0
        while (c < s.length - 1){
            a = s.indexOf('@', c)
            b = s.indexOf('.', c)
            c = s.indexOf(';', c+1)
            println(s.substring(a+1, b))
        }
    }
}

fun main(args: Array<String>) {

    var les16 = les16()
    les16.email("1@yandex.ru; on@mail.ru; ona@gmail.ru")


    }

