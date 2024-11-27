package demo02_extend.bean

class Man(name:String): Human(name) {
    override fun eat() {
        println("man ${name} eat big!")
    }

    override fun pee() {
        println("man ${name} pee stand!")
    }

}