fun main(){
    val arr = arrayOf(0, 100, 200, 300, 400, 500)
    try{
        println(arr[6])
    }catch(e: Exception){
        println("Index 6 is not present in the array")
    }
}