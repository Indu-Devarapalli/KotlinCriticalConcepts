package com.example.myapplication

class Laptop(val brand: String, val model: String) { // Primary constructor

    var price: Int = 0

    // Secondary constructor
    constructor(brand: String, model: String, price: Int) : this(brand, model) {
        this.price = price
    }

    fun showDetails() {
        println("Brand: $brand")
        println("Model: $model")
        println("Price: ₹$price")
    }
}

fun main() {
    // Using primary constructor
    val basicLaptop = Laptop("Dell", "Inspiron")
    basicLaptop.showDetails()

    println("----")

    // Using secondary constructor
    val fullLaptop = Laptop("HP", "Pavilion", 55000)
    fullLaptop.showDetails()
}

