fun main(){
    var a = mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
    a.add(7,12)
    println(a.filterNotNull())
}