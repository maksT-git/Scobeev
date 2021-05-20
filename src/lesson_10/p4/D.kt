package lesson_10.p4


import lesson_10.p1.A
import lesson_10.p1.p2.B.Companion.b
import lesson_10.p1.p2.B.Companion.bb
import lesson_10.p1.p2.p3.C
import lesson_10.p4.p5.E


fun main(args: Array<String>) {

var AA = A()
    var CC = C()
    var EE = E()
    var DD = AA.a + CC.c + EE.e  + b + bb
    println(DD)
    println(EE.e)

}
