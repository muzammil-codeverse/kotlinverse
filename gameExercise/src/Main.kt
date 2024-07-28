
fun main(){
// 1.1
    println(123+456*789)
// 1.2
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
// 1.3
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
// 1.4
    println(13530.0 / 1.23)
//  2
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    val totalScore = scoreLevel1+scoreLevel2+scoreLevel3
    val averageScore = totalScore/3
    println("Total Score >> $totalScore")
    println("Average Score >> $averageScore")
//  3
    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = scoreBoost + totalScore
    println("Your Boost Score >> $scoreBoost")
    println("Your Final Score >> $finalBoostedScore")
}
