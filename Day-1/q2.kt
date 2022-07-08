fun main(){
    evennumber()
    oddnumber()
}

fun evennumber(){
  for (i in 0..100 step 2){
    println(i)
  }
}

fun oddnumber(){
  for(i in 1..100 step 2){
    println(i)
  }
}