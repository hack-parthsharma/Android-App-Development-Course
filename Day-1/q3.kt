fun main(){
    evennumber()
    oddnumber()
}

fun evennumber(){
  var i = 0
  while(i<=100){
    println(i)
    i+=2
  }
}

fun oddnumber(){
  var i = 1
  do{
    println(i)
    i+=2
  }while(i<=100)
}