package code.demo02_extend

import demo02_extend.bean.Human
import demo02_extend.bean.Man
import demo02_extend.bean.Woman

fun main(args: Array<String>) {
    //继承
//    var son = Son()
//    println("son's character: ${son.character}")
//    son.action()

    //抽象
//    var person = Man("Tom")
//    var people = Woman("Javy")
//    person.eat()
//    people.eat()
//    person.pee()
//    people.pee()

    var person2 = Man("zz")
    var person3 = Man("xx")
    var people2 = Woman("aa")
    var people3 = Woman("ss")
    var humanList = listOf<Human>(person2,person3,people2,people3)
    for(h in humanList){
        h.eat()
        h.pee()
    }

}