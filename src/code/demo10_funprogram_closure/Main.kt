package code.demo10_funprogram_closure
//todo
// not finished,not interested
fun main(args:Array<String>){
    val x = fibonacci()
    println(x())
    println(x())
    println(x())
    println(x())


}

val string = "HelloWorld"
fun makeFun():()->Unit{
    var count = 0
    return fun(){
        println(++count)
    }
}

fun fibonacci():()->Long{
    var first = 0L
    var second = 1L
    return fun():Long{
        val result = second
        second += first
        first = second - first
        return result
    }
}
