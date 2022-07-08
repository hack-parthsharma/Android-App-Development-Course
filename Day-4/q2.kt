class Book(var name:String,var publisher:String,var genre:String){

}

fun main(){
    val obj1 = Book("The Name of the Wind","Patrick Rothfuss","Fantasy Fiction, Novel, High fantasy, Heroic fantasy")
    println(" Name : ${obj1.name} \n Publisher : ${obj1.publisher} \n Genre : ${obj1.genre}")
}