package demo05_seal// 驴 + 马 的son,可能是驴子,可能是马, 要让后代say hello

//sealed Son只能由指定个数的子类
sealed class Son{
    fun sayHello(){
        println("hello everyone")
    }
    class xiaoxiaolv(): Son()
    class xiaoluozi(): Son()
}