fun main(){
    // 1.1
    print("What's Day Today >> ")
    val dayOfWeek = readln()
//    if(dayOfWeek=="Monday") println("8 AM to 12 PM")
//    else if (dayOfWeek=="Tuesday" || dayOfWeek == "Wednesday" || dayOfWeek == "Thursday") println("8 AM to 6 PM")
//    else if (dayOfWeek=="Friday") println("8 AM to 9 PM")
//    else if (dayOfWeek=="Saturday") println("9 AM to 4 PM")
//    else if (dayOfWeek=="Sunday") println("8 AM to 4 PM")
//    else println("Choose the Correct Day of Week Please:)")
    //    1.2
//    when (dayOfWeek){
//        "Monday" -> println("8 AM to 12 PM")
//        "Tuesday","Wednesday","Thursday" -> println("8 AM to 6 PM")
//        "Friday" -> println("8 AM to 9 PM")
//        "Saturday" -> println("9 AM to 4 PM")
//        "Sunday" -> println("8 AM to 4 PM")
//    }


//    It's an expression which return the boolean value cause within the value there's a condition which returns a boolean value
    print("What's Time Now >> ")
    var time = readln().toInt()
    println("1-AM\n2-PM")
    print(">> ")
    val isAM = readln().toInt()
    if (isAM == 2)  time +=12
    val isOpen =  when (dayOfWeek){
        "Monday" ->   time in 8..12
        "Tuesday","Wednesday","Thursday" ->  time in 8..18
        "Friday" -> time in 8..21
        "Saturday" -> time in 9..16
        "Sunday" -> time in 8..16
        else -> false
    }
    if(isOpen){
        println("Your Cafeteria is Open for Service :)")
    }
    else{
        println("Sorry for the Close :(")
    }
}