package code.demo06_funProgram
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

//函数式编程
//1 传入函数名称
//2 自定义名称
//3 it
//4 创建红色图片,res在该项目工程的src目录下,名称:red.bmp
fun main(args: Array<String>){
    var names = listOf<String>("Tom","Javy","Somebody")
//    names.forEach(print)//因为需要拿到对应的name //1
    names.forEach{
//        a -> println(a)//2
        println(it)//3
    }
    createImage()//4
}

//name.forEach action: (T) -> Unit
//参数在这里就是String,返回值是Unit
var print = fun(name:String):Unit{
    println(name)
}

fun createImage(){
    var image = BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
//    image.setRGB(0,0,0xff0000)
    var w = 0..99
    var h = 0..99
    image.apply {
        for (i in w){
            for (j in h){
                setRGB(i,j,0xff0000)//红色 依次将(i,j)像素上面设置为红色
            }
        }
    }
    ImageIO.write(image,"bmp",File("red.bmp"))
}


