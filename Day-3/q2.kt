class Laptop {
   var ram: Int = 4
   var brand: String = "Dell"
   var hdd: Int = 512

   fun performComputations(){
       println("I perform computations")
   }
}

fun main(){
    
    val obj1 = Laptop()
    obj1.ram = 16
    obj1.brand = "Asus"
    obj1.hdd = 4
    println("${obj1.brand} Laptop is a good laptop for a gamer. Specifications are ${obj1.ram} GB and ${obj1.hdd} TB Hard Disk")
    
    
    val obj2 = Laptop()
    obj2.ram = 8
    obj2.brand = "Dell"
    obj2.hdd = 1
    println("${obj2.brand} Laptop is a good laptop for a Programmer or Student. Specifications are ${obj2.ram} GB and ${obj2.hdd} TB Hard Disk")
}