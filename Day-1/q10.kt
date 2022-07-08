fun main() {
    var football_stars_mutable = mutableListOf("Lionel Messi","Wayne Rooney","Luka Modric","Eden Hazard","Sergio Aguero")
    
    football_stars_mutable.add("Harry Kane")
    football_stars_mutable.removeAt(1)
    football_stars_mutable.add(1,"Neymar Jr")
    
    println(football_stars_mutable)
}