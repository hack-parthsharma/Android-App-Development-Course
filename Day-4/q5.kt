data class Student(var name:String,var rollNumber:Int,var percentageMark:Double){
    fun printValues() = println("Name : $name \nRoll Number : $rollNumber \nPercentage Mark : $percentageMark\n")
}

fun main() {
   var studentList = mutableListOf<Student>()
   studentList.add(Student("Cristina", 1290, 78.5))
   studentList.add(Student("Mark", 1291, 88.25))
   studentList.add(Student("Lea", 1292, 71.0))
   studentList.add(Student("Jack", 1293, 78.5))
   studentList.add(Student("Anies", 1294, 78.5))
   studentList.add(Student("Danielle", 1295, 78.5))
   studentList.add(Student("Sandra", 1296, 78.5))
   studentList.add(Student("Katina", 1297, 78.5))
   studentList.add(Student("Edgar", 1298, 78.5))
   studentList.add(Student("Felix", 1299, 78.5))
   
   for ( i in studentList){
       i.printValues()
   }
   
}