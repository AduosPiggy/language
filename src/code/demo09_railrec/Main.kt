package code.demo09_railrec
/**
 * 尾递归：调用完自己后没有任何操作的递归
 *
 * tailrec 关键字可以提示编译器尾递归优化
 *
 * 好处：
 *      1.不增加新的栈;
 *          当递归深度很大时，普通递归会导致栈溢出，因为每次递归调用都会占用一个新的栈帧，尾递归优化通过复用当前栈帧来避免栈溢出问题
 *
 *      2.性能优化
 *          减少了栈帧的创建和销毁，这使得尾递归函数的执行效率接近于迭代函数
 */

//第二个参数默认值为null
data class ListNode(val value:Int, var next: ListNode?=null)
fun main(args:Array<String>){
    val MAX_NODE_COUNT = 100000
    val head = ListNode(0)
    var p = head
    for(i in 1..MAX_NODE_COUNT){
        p.next = ListNode(i)
        p = p.next!!
    }

    println(findListNode(head, MAX_NODE_COUNT-2)?.value)
}
// 不加上 tailrec, 会导致 Exception in thread "main" java.lang.StackOverflowError
tailrec fun findListNode(head: ListNode?, value: Int): ListNode?{
    head?:return null
    if (head.value == value)
        return head
    return findListNode(head.next,value)
}
//因为return时,有 n*,所有就不是尾递归
fun factrial(n:Long):Long{
    return n * factrial(n-1)
}
data class TreeNode(val value: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}
//也不是尾递归
fun findTreeNode(root: TreeNode?, value:Int): TreeNode?{
    root?:return null
    if(root.value == value)
        return root
    return findTreeNode(root.left,value) ?:return findTreeNode(root.right,value)
}
