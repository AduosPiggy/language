package code.demo03_implements

import demo03_implements.bean.Human
import demo03_implements.bean.IMan
import demo03_implements.bean.Man
import demo03_implements.bean.Taijian

fun main(args: Array<String>){
    var man = Man()
    man.xiaoDD()
    man.eat()

    var man2 = Taijian()
    man2.eat()

    var house = listOf<Human>(man,man2)
    for(m in house){
        if(m is IMan){
            m.eat()
        }
    }
}

