package code.demo08_highfun01

import java.io.BufferedReader
import java.io.FileReader
import java.lang.StringBuilder

fun main(args:Array<String>) {
//    logForeachMap()
    logFlat()
}

/**
 * 01 forEach
 *
 * 02 Map
 */
fun logForeachMap(){
    /**
    val list = listOf(1,2,3,4,5,6,10)

    val newList = ArrayList<Int>()

    list.forEach{
        val ele = it*2+1
        newList.add(ele)
    }

    newList.forEach(::println)
     */
    val list = listOf(1,2,3,4,5,6,10)
    val newList = list.map {
        it * 2 +1
    }
    newList.forEach(::println)
    /**
     * val newList2 = newList.map {
     *         it.toDouble()
     *     }
     */
    val newList2 = newList.map(Int::toDouble)
}

/**
 * 03 FlatMap
 */
fun logFlat(){
    val list = listOf(
            1..20,
            2..5,
            100..108
    )
//    logFlatMap(list) //01 log [1,2,...,20,2,3,4,5,100,..,108]
//    logFlatListElement(list)//02 log No.
//    logReduce(list)//03 求和
//    logFactorial()//04 求每个阶层的值
//    logSumFactorial()//05 求和每个阶层值
//    logFold()//06 求和每个阶层值 + 初始值
//    logJoinToString()//07
//    logFilter()//08 filter
//    logTakeWhile()//09 takeWhile
    funLet()//10 let
//    funWith() //11 with
}

/**
 * 01 flatMap
 */
fun logFlatMap(list:List<IntRange>){
    val flatList = list.flatMap { it }
    flatList.forEach(::println)
}
/**
 * 02 log:  No. 1 No. 2 ...  No. 20 No. 2 ... No. 5 ...
 */
fun logFlatListElement(list:List<IntRange>){
    val flatList = list.flatMap { intRange ->
        intRange.map { intElement ->
            "No. $intElement"
        }
    }
    flatList.forEach(::println)
}

/**
 * 03 求和
 *
 * 1160
 */
fun logReduce(list:List<IntRange>){
    val flatList = list.flatMap { it }
    val sum = flatList.reduce{ acc, i ->
        acc + i
    }
    println(sum)
}

/**
 * 04 求阶层, 求0的阶层,求1的阶层,..,求n的阶层
 *
 * 1 1 2 6 24 120 720
 */
fun logFactorial(){
    //首先将0-6存入map,
    //然后依次当作参数传入factorial中求阶层,
    //最后再遍历map println每个值
    val range:IntRange = (0..6)
    range.map(::factorial).forEach(::println)
}

/**
 * 05 将 0-6的阶层的值求和
 *
 *  874
 */
fun logSumFactorial(){
    val range:IntRange = (0..6)
    val res = range.map(::factorial).reduce{ acc, i ->
        acc + i
    }
    println(res)
}

/**
 * 06 将 0-6的阶层的值求和 + 初始值
 */
fun logFold(){
//    fold01()
    fold02()
}
// 879
fun fold01(){
    val range:IntRange = (0..6)
    val res = range.map(::factorial).fold(5){ acc, i ->
        acc + i
    }
    println(res)
}
// 1,1,2,6,24,120,720,
fun fold02(){
    logFoldNormal()
    logFoldRight()
    logFoldIndexedNormal()
    logFoldIndexedRight()
}

/**
 * 1,1,2,6,24,120,720,
 */
fun logFoldNormal(){
    val range:IntRange = (0..6)
    val res = range.map(::factorial).fold(StringBuilder()){ acc, i ->
        acc.append(i).append(",")
    }
    println(res)
}

/**
 * 720,120,24,6,2,1,1,
 */
fun logFoldRight(){
    val range:IntRange = (0..6)
    val res = range.map(::factorial).foldRight(StringBuilder()){ i, acc ->
        acc.append(i).append(",")
    }
    println(res)
}

/**
 * 1,1,2,6,24,120,720
 */
fun logFoldIndexedNormal(){
    val range:IntRange = (0..6)
    val res = range.map(::factorial).foldIndexed(StringBuilder()){ index,acc,i ->
        acc.append(i)
        if(index != range.last){
            acc.append(",")
        }
        acc//返回acc 便于下一次迭代使用
    }
    println(res)
}
/**
 * 720,120,24,6,2,1,1
 */
fun logFoldIndexedRight(){
    val range: IntRange = (0..6)
    val reversedList = range.map(::factorial).reversed()//反转元素顺序
    val res = reversedList.foldIndexed(StringBuilder()) { index, acc, i ->
        acc.append(i)
        if (index != reversedList.lastIndex) {  // 使用 reversedList 的 lastIndex
            acc.append(",")
        }
        acc  // 返回acc 便于下一次迭代使用
    }
    println(res)
}

fun factorial(n:Int):Int{
    if(n==0)
        return 1
    val res = (1..n).reduce{acc, i -> acc * i  }
    return res
}

/**
 * 07 joinToString
 *
 * 0,1,2,3,4,5,6
 */
fun logJoinToString(){
    val range:IntRange = (0..6)
    val res = range.joinToString(",")
    println(res)
}

/**
 * 08 filter
 */
fun logFilter(){
    filterByValue()
    filterByIndex()
}

/**
 * 根据value是奇数数筛选出来的值
 *
 * [1, 3, 5]
 */
fun filterByValue(){
    val range: IntRange = (0..6)
    val res = range.map{it}.filter {
        (it % 2) == 1
    }
    println(res)
}

/**
 * 根据index位置是偶数筛选出来的值
 *
 * [0, 2, 4, 6]
 */
fun filterByIndex(){
    val range: IntRange = (0..6)
    val res = range.map{it}.filterIndexed() { index,i ->
        (index % 2) == 0
    }
    println(res)
}

/**
 * 09 如果是偶数就一直取,直到取到第一个不是偶数
 *
 * [0, 2, 4]
 */
fun logTakeWhile(){
    val list = listOf<Int>(0,2,4,1,2,3,4)
    val res = list.takeWhile {
        (it % 2) == 0
    }
    println(res)
}

/**
 * 10 let
 *
 * 解决多个 ?.
 */
data class Person(val name:String, val age:Int){
    fun work(){
        println("$name is working!")
    }
}
fun findPerson(): Person?{
    return Person("Tom",23)
//    return null
}
fun funLet(){
//    funLet01()
//    funLet02()
    funLet03()
}
fun funLet01(){
    findPerson()?.let { person ->
        println(person.name)
        println(person.age)
    }
}

/**
 * Tom is working!
 *
 * age23‘s Tom is still working!
 */
fun funLet02(){
    findPerson()?.let { it ->
        it.work()
        println("age${it.age}‘s ${it.name} is still working!")
    }
}

/**
 * Tom is working!
 *
 * age23‘s Tom is still working!
 */
fun funLet03(){
    findPerson()?.apply {
        work()
        println("age$age‘s $name is still working!")
    }
}

/**
 * 11 funWith04()
 * 调用传入对象作用域的方法和成员
 */
fun funWith(){
//    funWith01()
    funWith02()
}
fun funWith01(){
    val br = BufferedReader(FileReader("hello.txt"))
    //在with作用域内调用BufferedReader的方法  readLine() 和 close()
    with(br){
        var line:String?
        while(true){
            line = readLine()?:break
            println(line)
        }
        close()
    }
}
fun funWith02(){
    //use 要closeable的对象
    val br = BufferedReader(FileReader("hello.txt")).use {
        var line:String?
        while(true){
            line = it.readLine()?:break
            println(line)
        }
    }
}