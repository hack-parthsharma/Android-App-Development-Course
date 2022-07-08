class Clothes(material:String,colour:String,price:Int){

    var material:String
    var colour:String
    var price:Int
    
    init{
        this.material = material
        this.colour = colour
        this.price = price
    }
    
}

fun main(){
    val obj1 = Clothes("cotton","Black",1369)
    println(" ${obj1.material} material , ${obj1.colour} colour and price is only ${obj1.price}")
}