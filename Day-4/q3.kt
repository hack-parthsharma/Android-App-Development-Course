class Person(var firstName:String , var lastName:String){
    fun greet(){
        println("Hello ${firstName} ${lastName}, Welcome to Internshala Trainings!")
    }
}

fun main(){
    val obj1 = Person("Smruti Ranjan","Nayak")
    
    obj1.greet()
}