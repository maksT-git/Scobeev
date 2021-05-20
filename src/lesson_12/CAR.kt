package lesson_12

import lesson_11.Student




fun main(args:Array<String>) {

    var st1 = Student("Ivan", 3, 9.5)
    var st2 = Student("PEtr", 1, 5.5)


    fun StudentTest(st1: Student, st2: Student) {

         st1.changeName(st1, st2)


    }


    StudentTest(st1, st2)
    println(st1.name)
    println(st2.name)





}

