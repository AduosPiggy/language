package code.demo11_funcompose
fun main(args:Array<String>){
    println(multiplyBy2(add5(8)))
    val add5AndThenMultiplyBy2 = add5 andThen multiplyBy2
    println(add5AndThenMultiplyBy2(8))  // f(g(x))

    println(add5(multiplyBy2(8)))
    val add5ComposeMultiplyBy2 = add5 compose  multiplyBy2
    println(add5ComposeMultiplyBy2(8)) // g(f(x))
}

val add5 = { i:Int -> i+5 }//g(x)
val multiplyBy2 = { i:Int -> i*2 }//f(x)

/**
 * Function1<P1, P2> 是一个函数类型，表示一个从 P1 类型到 P2 类型的函数
 * function: Function1<P2, R> 是另一个函数参数，表示一个从 P2 类型到 R 类型的函数。
 * Function1<P1, R> 是返回类型，表示一个从 P1 类型到 R 类型的函数。
 * @return 调用this.invoke(p1),执行Function1<P1,P2>,返回P2类型,然后传入这个P2到function: Function1<P2,R>,得到R类型
 */
infix fun <P1,P2,R> Function1<P1,P2>.andThen(function: Function1<P2,R>): Function1<P1, R>{
    return fun(p1:P1): R{
        return function.invoke(this.invoke(p1))
    }
}
infix fun <P1,P2,R> Function1<P2,R>.compose(function: Function1<P1,P2>): Function1<P1, R>{
    return fun(p1:P1): R{
        return this.invoke(function.invoke(p1))
    }
}