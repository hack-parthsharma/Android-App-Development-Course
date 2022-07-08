class Car(var brandName:String,var color:String , var engineNumber:Int){
    fun accelerate() = println("Speed...")
    fun applyBrakes() = println("Stop...")
}

fun main(){
    
    val obj1 = Car("BMW","Blue",547541)
    
    obj1.accelerate()
    obj1.applyBrakes()
}