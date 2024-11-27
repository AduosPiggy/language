package demo02_extend.bean

open class Father {
    var character:String = "性格内向"
    open fun action(){
        println("speak loudly!")
    }
}