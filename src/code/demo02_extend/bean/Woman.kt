package demo02_extend.bean

class Woman(name:String): Human(name) {
    override fun eat() {
        println("woman ${name} eat small!")
    }
    override fun pee() {
        println("woman ${name} pee tangzhe!")
    }
}