class Player(
    private val firstName:String,
    private val surName:String
)
{
    var bestScore:Int = 0
    var totalScore:Int = 0
    fun fullName():String{
        return "$firstName $surName"
    }
}
class Score(){
    fun isNewHighScore(score:Int,player:Player){
        player.bestScore = if (score > player.bestScore) score else player.bestScore
    }
    fun whoWon(player1:Player,player2:Player):String{
        return if (player1.totalScore > player2.totalScore) "${player1.fullName()} Won the Game by ${player1.totalScore-player2.totalScore}"
        else "${player2.fullName()} Won the Game by ${player2.totalScore-player1.totalScore}"
    }
}
fun main(){
    val score = Score()
    val player1:Player = Player("Muzammil","Hassan")
    val player2:Player = Player("Abdur Rehman","Khalid")
    var levelScore:Int
    for(i in 1..3){
        print("Enter the Score of Player 1 in Match $i >> ")
        levelScore = readln().toInt()
        player1.totalScore+=levelScore
        score.isNewHighScore(levelScore,player1)
        print("Enter the Score of Player 2 in Match $i >> ")
        levelScore = readln().toInt()
        score.isNewHighScore(levelScore,player2)
        player2.totalScore+=levelScore
    }
    println(score.whoWon(player1,player2))
    if(player1.totalScore>player2.totalScore) println("${player1.fullName()} Total Score is >> ${player1.totalScore}, Personal Best is >> ${player1.bestScore}")
    else println("${player2.fullName()} Total Score is ${player2.totalScore}, Personal Best is >> ${player2.bestScore}")
}