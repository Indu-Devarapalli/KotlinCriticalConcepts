package com.example.myapplication

//Define the value-based data class
data class CartItem(
    val name: String,
    val quantity: Int,
    val pricePerUnit: Double
)

fun main() {
    val item1 = CartItem("Headphones", 2, 150.0)
    val item2 = CartItem("Headphones", 2, 150.0)

    // Value-based equality
    println("item1 == item2: ${item1 == item2}")

    // HashSet uses hashCode()
    val itemSet = hashSetOf(item1, item2)
    println("Set size: ${itemSet.size}")

    // toString() auto-generated
    println(item1)  // CartItem(name=Headphones, quantity=2, pricePerUnit=150.0)

    // copy() method
    val item3 = item1.copy(quantity = 3)
    println(item3)  // CartItem(name=Headphones, quantity=3, pricePerUnit=150.0)

    // Destructuring with componentN()
    val (name, qty, price) = item1
    println("Product: $name, Qty: $qty, Price: $price")
}
