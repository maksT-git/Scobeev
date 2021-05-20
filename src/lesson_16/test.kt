package lesson_16

class test {
}

fun main(args: Array<String>) {
    var p = "С образцом задания на испытательный срок можно ознакомиться ниже: Задачи для проверки квалификации. ... Приводим самый простой пример:"
var s = p.toUpperCase()
   var c1:Char
   var c2:Char
    for (i in p.indices){


     c1 = p[i]
        c2 = s[i]

      if(c1!='.' && c1!=' ' && c1!= ':'&& c1== c2){
          println()
          print(c1)
          continue
        }
print(c1)
    }
println()
    }


