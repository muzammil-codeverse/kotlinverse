class Subject(
    val subjectName:String, //Must have type specified
    val teacher:Teacher,
    val availability:Boolean
)
{
    fun whoTeachesSubject():Teacher{
        return Teacher("Akhtar",35)
    }
}
class Teacher(
    val name:String,
    val age: Int
)
fun main(){
    val aslam = Teacher("Aslam",30)
    val bio = Subject("Biology",aslam,true)
    println(bio.teacher.age)
    val newTeacher:Teacher = bio.whoTeachesSubject()
    println(newTeacher.name)
}