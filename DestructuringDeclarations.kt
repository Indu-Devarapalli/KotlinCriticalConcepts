package com.example.myapplication

//Destructing using Function
fun divide(x: Int, y: Int): Pair<Int, Int> {
    return Pair(x / y, x % y)
}

//Destructuring a Data Class
data class Employee(val name: String, val age: Int)

fun main() {
    val (quotient, remainder) = divide(10, 3) // function
    println("Quotient: $quotient")   // 3
    println("Remainder: $remainder")

    val employee = Employee("Alice", 30)
    //val (name, age) = employee
    //println("Name: $name")
    //println("Age: $age")

    //Ignoring Values with _
    val (name, _) = employee
    println(name)

}

