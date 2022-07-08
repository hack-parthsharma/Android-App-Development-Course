fun main() {
    var a = 0
    var b = 1
    
    var k = 0
    
    print("$a $b ")
    for(i in 1..8){
        k = a + b 
        print(" $k")
        a = b 
        b = k 
    }
    
}