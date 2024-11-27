package demo03_implements.bean

//接口:反应能力   IMan
//抽象类:本质    Human()
class Man: IMan, Human(){
    override fun xiaoDD() {
        println("dream 18cm")
    }

    override fun eat() {
        println("man eat")
    }

}