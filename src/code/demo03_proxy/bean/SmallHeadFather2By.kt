package demo03_proxy.bean

class SmallHeadFather2By: IWashBowl by BigHeadSon {
    override fun washing() {
        println("i'm father2")
//        BigHeadSon().washing()//son 非单例时侯的样子
        BigHeadSon.washing()
        println("watching son make money for me")
    }
}
