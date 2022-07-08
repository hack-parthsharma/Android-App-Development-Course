# Day 2

> Date : 02/01/2022


### Module : ( World of Kotlin ) 
![error](https://cdn57.androidauthority.net/wp-content/uploads/2017/11/kotlin-and-android-840x472.jpg.webp)
## Errors and Exceptions

1. ** Error ** is  a serious problem that doesn"t let a program run.
2. ** Exception ** indicates conditions that may or may not let the program run based on the exception of the program.

#### Syntax: ( ** Try-Catch Block ** )

```kotlin
try{
  //Block of code monitor for erroes
  //the code you think can raise an exception
}
catch(e1:ExceptionType1){
  //Exception handler for ExceptionType1
}

finally{
  //block of code to be executed after try block ends
}
```
#### Types of Exception :
* ArithmeticException
* ArrayIndexOutOFBoundsException
* Null Pointer Exception ( NPE )

#### Null Pointer Exception : 
A ** Null pointer exception ** occur when the compiler excpects a value for a variable but insted gets Null ( No value ).

` ? ` - Null Safty Operator 

```Kotlin
val a:String = null // Without use null safty operator 
println(a) // we getting error

val b: String? = null // use null safty operator
println(b) // Output is Null and not getting any error 
```

`A Null Safty Operator is used to declare a variable whose value maybe null `

##### Safe calls :
`?.`- Safe call operator

```kotlin

val a = "Kotlin"
val b: String? = null
println(b?.length)
println(a?.length) // Unnecessary safe call

```

##### Elvis operator :
`?:` - Elvis operator 

```kotlin
val l = b?.length ?: -1
```

* If you have a collection of elements of a nullable type and want to filter non-null elements, you can do so by using `filterNotNull()` :
```kotlin
val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList: List<Int> = nullableList.filterNotNull()
```
#### Problems : (Coding Practice) 

|Question Number|Question|Ans|
|---------------|--------|---|
|01|Print the value present at index 6 in the given array. `arr = [0, 100, 200, 300, 400, 500]`. Use try-catch to catch the exception if any.|[q1.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-2/q1.kt)|
|02|Initialise a String as “Hello, Kotlin” and change its value to null. Now print the length of the String using safe call and non-null assertion operator.|[q2.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-2/q2.kt)|
|03|Initialise a variable x = null and print the value as 0.0 while printing x using the Elvis operator.|[q3.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-2/q3.kt)|
|04|Given a list = `[1, null, 2, 4, null, 6, 8, 10, null]`. Insert the number 12 to the number at index 7 and then print out the complete list without any exceptions or null values in the output.|[q4.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-2/q4.kt)|


