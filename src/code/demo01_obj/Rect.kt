package code.demo01_obj
fun main(args: Array<String>){
    logRect()
    logGirl()
}

class Rect (var height:Int, var width:Int)
fun logRect(){
    var rect01 = Rect(20,10);
    println("height: ${rect01.height}")
    println("height: ${rect01.width}")
}
fun logGirl(){
    var girl = Girl("biaohan","crying");
    println("girl character: ${girl.character} + voice: ${girl.voice}")
    girl.smile()
    girl.cry()
}

class Girl(var character:String, var voice:String){
    fun smile(){
        println("girl smiled")
    }
    fun cry(){
        println("girl cried")
    }
}