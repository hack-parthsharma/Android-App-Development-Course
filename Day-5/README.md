## Day-5

> Date : 05/01/22

#### Module : ( World of Kotlin ) 
![error](https://cdn57.androidauthority.net/wp-content/uploads/2017/11/kotlin-and-android-840x472.jpg.webp)

## Inheritance and Interfaces

#### Inheritance : 
* It is one of the key concepts of OOP.It enables re-usability that is it allows a class to inherit features(Properties and behaviours ) from another class.
* The class  that inherits the features is called the `child class` and the class whose features are inherited is called the `parent class`.

* `parent class / base class / super class`
* `child class / derived class / sub class`

```text 
whenever we create parent and child classes each class should satisfy the condition `child class is a parent class`
```

Syntax of Creating a `Parent Class` : 
```kotlin
open class BaseClass(Properties){...}
```

Syntax of Creating a `Child Class` : 
```kotlin
class DerivedClassName(Properties of base class and Properties of derived class):BaseClassName(Properties){...}
```

Example : 
```kotlin
open class Car{ // parent class
   fun speedUp(){
       println("The car is speeding up")
   }
   fun applyBrakes(){
       println("Brakes are applied")
   }
}

class Hyundai: Car(){ // child class
  
}

class Honda: Car(){ // child class
  
}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
}
```