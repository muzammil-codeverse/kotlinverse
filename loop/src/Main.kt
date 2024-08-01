fun main(){
//    for (i in "ABCPDF"){
//        print("$i,")
//    }
//    for (i in 1..5){
//        print("$i,")
//    }
//    val number = 5
//    for (i in number downTo 0){
//        println("$i")
//    }
//    for (i in 1..100 step 5){
//        print("$i,")
//    }
//    println()

//    for (i in 1..5){
//        for(j in 5 downTo i){
//            print("*")
//        }
//        println()
//    }


//    var num=0;
//    for(i in 1..5){
//        when (i){
//            1,5 -> num = 1
//            2 -> num = i+1
//            3 -> num = i+2
//            4 -> num = i-1
//        }
//        for (j in 1..num){
//            print("*")
//        }
//        println()
//    }


//    val width = 5
//    for (i in 1..<width step 2){
//        for (j in 1..i){
//            print("*")
//        }
//        println()
//    }
//    for(i in width downTo 1 step 2){
//        for(j in 1..i){
//            print("*")
//        }
//       println()
//    }


//    for(i in 1..5){
//        val space = 5-i
//        for(j in 1..space){
//            print(" ")
//        }
//        for(k in 1..i){
//            print("*")
//        }
//        println()
//    }
    for (i in 1..5) {
        val space = 5 - i
        for (j in 1..space) {
            print(" ")
        }
        val star = i*2-1
        for (k in 1..star){
            print("*")
        }
        println()
    }
}