package code.demo12_currying
import java.io.OutputStream
import java.nio.charset.Charset

//科理化:多元函数变换成一元函数调用链
//偏函数
fun main(args:Array<String>){
    logCurried()//科理化
    logPartialFun()//偏函数

}
fun logCurried(){
    log("Tom",System.out,"common")//common
    log2("Tom")(System.out)("currying2")//curried
    ::log.curried()("Tom")(System.out)("curried")//curried
}
//common
fun log(tag:String, target:OutputStream, msg:Any?){
    target.write("[$tag] $msg\n".toByteArray())
}
//curried
fun log2(tag: String)
    = fun(target: OutputStream)
    = fun(msg: Any?)
    = target.write("[$tag] $msg\n".toByteArray())

/**
 * =fun(p1:P1) = fun(p2:P2) = fun(p3:P3) = this(p1,p2,p3)
 * 第一个函数接受一个 P1 类型的参数 p1，并返回一个接受 P2 类型参数的函数。
 * 第二个函数接受一个 P2 类型的参数 p2，并返回一个接受 P3 类型参数的函数。
 * 第三个函数接受一个 P3 类型的参数 p3，并调用原始的 Function3 函数 this，传入 p1, p2, p3 参数，返回结果 R。
 */
fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
    =fun(p1:P1) = fun(p2:P2) = fun(p3:P3) = this(p1,p2,p3)

fun logPartialFun(){
    logPartialFun01()
    logPartialFun02()
}
fun logPartialFun01(){
    val logWithTag = (::log.curried())("Tom")(System.out)
    logWithTag("partial function")

}
fun logPartialFun02(){
    val makeString = fun(byteArray: ByteArray, charset: Charset):String{
        return String(byteArray,charset)
    }
    val makeStringFromGBKBytes = makeString.partial2(charset("GBK"))
    val bytes = "我是中国人".toByteArray(charset("GBK"))
    val string = makeStringFromGBKBytes(bytes)

}


fun <P1,P2,R> Function2<P1,P2,R>.partial2(p2:P2) = fun(p1:P1) = this(p1,p2)
fun <P1,P2,R> Function2<P1,P2,R>.partial1(p1:P1) = fun(p2:P2) = this(p1,p2)