package code.demo05_seal

import demo05_seal.Son

//印章类 sealed
fun main(args: Array<String>){
    var s: Son = Son.xiaoluozi()
    var s2: Son = Son.xiaoxiaolv()
    var s3: Son = Son.xiaoluozi()
    var list = listOf<Son>(s,s2,s3)

    for(l in list){
        if(l is Son.xiaoluozi){
            l.sayHello()
        }
    }

}


