fun main() {
   val operatorList = listOf('+', '-', '*', '/')
   for (i in operatorList) {
       val output = performOperation(100, 20, i)
       println("The output of the operation $i is $output")
   }
}

fun performOperation(a: Int, b: Int, operator: Char): Int {
   var c = 0
   if (operator == '+') {
       c = a + b
   }
   if (operator == '-') {
       c = a - b
   }
   if (operator == '*') {
       c = a * b
   }
   if (operator == '/') {
       if (b != 0) {
           c = a / b
       } else {
           c = 0
       }
   }
   return c
}