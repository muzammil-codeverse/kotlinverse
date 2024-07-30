fun main(){
    print("Enter Your Name >> ")
    val name = readln()
    println(name.uppercase())
    println(name.lowercase())
    println(name.substring(1,5))
    println(name == "Muzammil")
    println(name[3].code)
    val value:Int =
        if (name == "Muzammil Hassan") {
            20
        }
        else{
            30
        }
    println(value)
}