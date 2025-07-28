package com.example.myapplication

class Animal {
    var name: String = "Unknown"

    fun speak() {
        println("My name is $name")
    }
}

fun main() {
    val dog = Animal()  //  dog is an object of class Animal
    dog.name = "Buddy"
    dog.speak()        
}
