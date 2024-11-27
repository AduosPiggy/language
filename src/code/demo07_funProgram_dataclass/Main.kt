package code.demo07_funProgram_dataclass

data class Girl(var name:String, var age:Int,var height:Int, var addr:String)
var db_girl = listOf<Girl>(
        Girl("Javy",17,150,"四川母暴龙"),
        Girl("zhu",18,156,"成都母暴龙"),
        Girl("jia",19,157,"龙泉母暴龙"),
        Girl("yi",38,158,"龙泉驿母暴龙"),
        Girl("zhoujiayi",33,159,"四川母暴龙"),
        Girl("ye",19,159,"四川母暴龙"),
        Girl("Tom",20,180,"老帅")
)
fun main(args: Array<String>){
//    filterByAddr("四川母暴龙")
//    filterByAge(20)
//    filterByAgeAddr(20,"四川母暴龙",false)
//    filterOld()
//    filterYoung()
    filterDiy()
}
fun filterDiy(){
    println(db_girl.filter {
        (it.age==18) and (it.height>155)
    })
}
fun filterYoung(){
    println(db_girl.minBy { it.age })
}
//找年龄最大的妹子
fun filterOld(){
    println(db_girl.maxBy { it.age })
}

fun filterByAddr(addr:String){
    var girl_sichuan = ArrayList<Girl>()
    for(girl in db_girl){
        if(girl.addr.equals(addr)){
            girl_sichuan.add(girl)
        }
    }

    for (girl in girl_sichuan){
        println("${girl.name} + ${girl.age} 岁的old 美女")
    }
}
fun filterByAge(age:Int){
    var girlYes = ArrayList<Girl>()
    for(girl in db_girl){
        if(girl.age < age){
            girlYes.add(girl)
        }
    }
    for (girl in girlYes){
        println("${girl.name} + ${girl.age} 岁的old 美女")
    }
}
//注意条件是 &&, 即and
//flag; true:like young, false:like nice old
fun filterByAgeAddr(age:Int,addr: String,flag:Boolean){
    var girlYes = ArrayList<Girl>()
    for(girl in db_girl){
        if (flag){
            if((girl.age < age) and (girl.addr.equals(addr))){
                girlYes.add(girl)
            }
        }else{
            if((girl.age >= age) and (girl.addr.equals(addr))){
                girlYes.add(girl)
            }
        }
    }
    for (girl in girlYes){
        println("${girl.name} + ${girl.age} 岁的old 美女")
    }
}


