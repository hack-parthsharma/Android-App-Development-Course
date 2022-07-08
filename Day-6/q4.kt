interface Games{ // interface 
    fun football()
    fun cricket()
    fun basketball()
}

class Sports : Games{ // Child Class
    override fun football() = println("football") // Here ovride a interface function 
    override fun cricket() = println("cricket")
    override fun basketball() = println("basketball")
}
fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()
    
}