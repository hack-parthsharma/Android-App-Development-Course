open class Car{ //Parent Class
    fun speedUp(){
        println("Speeding...")
    }
    fun applyBrake(){
        println("Brake...")
    }
}

class Bmw : Car(){ //Child Class
    
}
class Jaguar : Car(){ // Child Class
    
}
fun main() {
    val obj1 = Bmw()
    obj1.speedUp()
    obj1.applyBrake()
    
    val obj2 = Jaguar()
    obj2.speedUp()
    obj2.applyBrake()
}