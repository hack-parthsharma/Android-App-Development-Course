class Laptop{
    var ram:Int = 8
    var brand:String = "Asus"
    var diskSize:Int = 2
    
    fun performComputations(){
        println("I perform computations")
    }
}

fun main(){

    val obj1 = Laptop()
    println("Brand Name : ${obj1.brand} RAM : ${obj1.ram}GB Disk Size : ${obj1.diskSize} TB")

    obj1.performComputations()
   
}