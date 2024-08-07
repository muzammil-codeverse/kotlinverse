var name = "" // top level variables
fun starDisplay(starSize:Int){
    for(i in 1..starSize){
        print("*")
    }
    println()
}
fun hello1(): String {
//    Local Variable scope is within its braces.
    val a = "Hello I'm a"
    return a
}

fun main(){
    val a = "Hello I'm a but in Main"
    println(a)
    println(hello1())
    println(a)
    for(i in 1..5){
        starDisplay(i)
    }
}
