package code.demo03_proxy

import demo03_proxy.bean.BigHeadSon
import demo03_proxy.bean.SmallHeadFather
import demo03_proxy.bean.SmallHeadFather2By

fun main(args: Array<String>){
    var son = BigHeadSon
    var father = SmallHeadFather()//接口
    var father2 = SmallHeadFather2By()//代理 by

    BigHeadSon.washing()
    father.washing()
    father2.washing()
}

