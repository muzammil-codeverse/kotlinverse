fun recursiveFactorial(args1:Int):Int{
    if(args1==1||args1<=0){
        return 1
    }
    return args1 * recursiveFactorial(args1-1)
}
fun main(){
    print("Enter the Number of Factorial you want to print >> ")
    val factorial = (readln()).toInt()
    print("Factorial of $factorial is ${recursiveFactorial(factorial)}")
}