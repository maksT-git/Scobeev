package lesson_11



fun main(args:Array<String>) {

    var st1 = Student("Ivan", 5, 10.5)
    var st2 = Student("PEtr", 5, 15.0)


    fun StudentTest(st1: Student, st2: Student) {
        st1.changeName(st1, st2)

    }

    fun pervii() {
        if (st1.name.equals(st2.name) )
            println("Первый студент выше курсом")
        else if (st1.course < st2.course)
            println("Второй студент выше курсом")
                 else println("Студенты на одном курсе")
    }

    fun vtoroi() {
        if (st1.course > st2.course) {
            println("Перый студент выше курсом")
            if (st1.grade > st2.grade) {
                println("Первый студент имеет выше балл")
            }
            else if (st1.grade < st2.grade) {
                println("Второй студент имеет выше балл")
            }
            else println("Оба студента одинаковый балл")
        }



        if (st1.course < st2.course) {
            println("Второй студент выше курсом")
            if (st1.grade > st2.grade) {
                println("Первый студент имеет выше балл")
            }
            else if (st1.grade < st2.grade) {
                println("Второй студент имеет выше балл")
            }
            else println("Оба студента одинаковый балл")
        }
        if (st1.course == st2.course) {
            println("Оба студента на одном курсе")
            if (st1.grade > st2.grade) {
                println("Первый студент имеет выше балл")
            } else if (st1.grade < st2.grade) {
                println("Второй студент имеет выше балл")
            }
            else println("Оба студента одинаковый балл")
        }

    }
vtoroi()

    //pervii()
    StudentTest(st1, st2)
    println(st1.name)
    println(st2.name)

}
class Student{
var name = ""
    var course = 0
    var grade = 0.0
    constructor(name: String, course:Int, grade:Double){
        this.name = name
        this.course = course
        this.grade = grade
    }
    fun changeName(s1: Student, s2: Student){
        s1.name = "Vasia"
        s2.name = "petya"
    }

}



