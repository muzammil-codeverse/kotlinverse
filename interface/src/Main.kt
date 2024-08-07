interface Animal{
    fun sound(){
        println("Animal Makes Sound")
    }
    val name:String
}
class Dog():Animal{
    override fun sound(){
        println("BOW!")
    }
    override val name = "Tommy"
    fun checkAnimal(){
        println("It's a Dog")
    }
}
class Cat():Animal{
    override fun sound() {
        println("Meow!")
    }
    fun checkAnimal(){
        println("It's a Cat")
    }
    override val name = "Kutto"
}
fun checkClass(animal: Animal){
    when (animal){
        is Dog -> {
            animal.checkAnimal()
            println(animal.name)
        }
        is Cat -> {
            animal.checkAnimal()
            println(animal.name)
        }
    }
}
fun main() {
        val dog:Animal = Dog()
        dog.sound()
        val dog2:Animal = Cat()
        dog2.sound()
        checkClass(dog)
        checkClass(dog2)
}