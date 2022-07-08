open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
  
   open fun  maxSpeed() = println("Max Speed")
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {
   override fun maxSpeed() = println("Maximum speed of Hyundai is 120 kmph")
}

class Honda(brandName: String = "Honda", color: String = "White") : Car(brandName, color) {
      override fun maxSpeed() = println("Maximum speed of Honda is 150 kmph")
}

fun main(){
   val hyundai = Hyundai()
   hyundai.maxSpeed()

   val honda = Honda()
   honda.maxSpeed()
}