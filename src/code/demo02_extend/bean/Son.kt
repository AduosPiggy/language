package demo02_extend.bean

class Son: Father() {
    override fun action(){
        println("speak easy!!")
    }
}