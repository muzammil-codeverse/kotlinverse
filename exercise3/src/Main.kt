fun getPoints(baseValue:Int,boostValue:Int):Int =  baseValue*boostValue
fun main(){
    var score = 0
    println("Your Score is >> $score")
    score+=getPoints(10,1)
    println("Your Score is >> $score")
    score+=getPoints(20,2)
    println("Your Score is >> $score")
    score+=getPoints(-10,1)
    println("Your Score is >> $score")
    score+=getPoints(5,3)
    println("Your Score is >> $score")
    score+=getPoints(-15,2)
    println("Your Score is >> $score")
}