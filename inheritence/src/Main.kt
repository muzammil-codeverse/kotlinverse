open class Parent(val value:String){
    fun helloParent(){
        println("Hello From Parent")
    }

}
class Child(private val name:String):Parent("$name Hassan"){
     fun helloChild(){
        println("Hello From Child")
    }
}
fun main(){
    val obj = Child("Muzammil")
    obj.helloParent()
    println(obj.value)
}