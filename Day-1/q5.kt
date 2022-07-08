fun main() {
    print("For Loop : ")
    var fsum = 0
    for(i in 1..50){
        fsum += i
    }
    println(fsum)
    print("While Loop : ")
    var wsum = 0
    var i = 1
    while(i<=50){
        wsum += i
        i += 1
    }
    println(wsum)
    print("Do-While Loop : ")
    var j = 1
    var dsum = 0
    do{
        dsum += j 
        j += 1
    }while(j<=50)
    println(dsum)
}