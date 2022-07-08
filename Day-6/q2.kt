open class Car(var brandName:String , var color:String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
}

class Hyundai(brandName:String = "BMW",color:String= "Black") : Car(brandName,color) {

}

class Honda(brandName:String = "Jaguar",color:String="White") : Car(brandName,color) {

}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
}