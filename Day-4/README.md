## Day-4

> Date : 04/01/22

#### Module : ( World of Kotlin ) 
![error](https://cdn57.androidauthority.net/wp-content/uploads/2017/11/kotlin-and-android-840x472.jpg.webp)

## Classes of Kotlin ( `Constructors and Real Life Applications`)

#### Constructors : 
* A `constructor` is a special kind of member function that is used to initialise the state or properties of the newly created objects of a class.
* `Constructors` is written inside the class.
* ** Constructors ** are required to create objects of a class. Every class must always have a ** Constructors ** .

Types of Constructors : 
  1. `Primary Constructors`
  2. `Secondary Constructors`

|Primary Constructors|Secondary Constructors|
|--------------------|----------------------|
|A class have only one Primary Constructor|A class can have multiple Secondary Constructor|

#### Primary Constructor : 
* Example : 
```kotlin
class Dog(breed:String,age:Int){
  var breed:String
  var age:Int

  init{
    this.breed = breed
    this.age = age
  }
}
```
Dog(`breed:String,age:Int`)  : Constructor Variable

{
  `var breed:String, 
   var age:Int1`
}  : Member or Local Variable 

** *
* A class that only use a Secondary constructor and not use Primary constructor.

###### Example : 
```kotlin
class Dog{
  var breed:String
  var age:Int

  constructor(breed:String,age:Int){
    this.breed = breed
    this.age = age
  }
}
```

* A class has both primary and Secondary constructor.
###### Example : 

```kotlin
class Dog(var breed:String,var age:Int){
  var name:String? = null 
  constructor(breed:String,age:Int):this(breed,age){
    this.name = name

  }
}
```
** *
#### Data Class : 
* A `Data Class` is just like a regular class that holds some data.
* Data Class are used to store data.
* They help us perform operations directly on the data stored in the object of a class.
* they help us in omitting redundent code 
*  A primary constructor of a data class must always have atleast one parameter.
** *
##### What is the uses of `this` keyword inside the `init{...}` block?
##### Ans : 
* it tells the compiler that the properties already been initialised in the primary constructor are needed in the Secondary constructor
* It tells the compiler that we are referring to the local variable on LHS and constructor variable on RHS.



** *
#### Problem : 

|Question Number|Question Name|Ans|
|---------------|-------------|---|
|01|Create class 'Clothes' with ‘material’, ‘colour’, and ‘price’ as properties in primary constructor and create its objects in the main function.|[q1.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-4/q1.kt)|
|02|Create a class named ‘Book’ with properties as ‘book name’, ‘genre’ and ‘publisher’ in the primary constructor and create its objects in the main function.|[q2.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-4/q2.kt)|
|03|Create a class ‘Person’ with the properties ‘first name’ and ‘last name’. Create a function ‘greeting’ and greet each created ‘Person’ object with the message “Hello ‘first name’ ‘last name’, welcome to Internshala Trainings!”|[q3.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-4/q3.kt)|
|04|Create a class Car with brandName, color, and engineNumber as properties along with accelerate() and applyBrakes() as functions. In the main function create multiple objects of this class Car.|[q4.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-4/q4.kt)|
|05|Store a list of ten students in a mutable list. Each student entry should have a name, roll number, and percentage marks. Make functions inside the class Student to print the values of each student in a separate line and then make Student class as data class and directly print the values.|[q5.kt](https://github.com/SM8UTI/Android_App_Development_Internshala_Course/blob/main/Day-4/q5.kt)|
