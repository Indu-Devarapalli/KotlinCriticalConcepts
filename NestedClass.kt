package com.example.myapplication

class Outer {
    private val outerMessage = "I'm from Outer class"

    // 🔹 Nested class (no access to Outer members)
    class Nested {
        fun showMessage() {
            println("Nested class: I can't access Outer class members directly.")
        }
    }

    // 🔹 Inner class (can access Outer members)
    inner class Inner {
        fun showMessage() {
            println("Inner class: I can access outerMessage ➝ $outerMessage")
        }
    }
}

fun main() {
    // Accessing Nested class
    val nested = Outer.Nested()
    nested.showMessage()

    // Accessing Inner class
    val outer = Outer()
    val inner = outer.Inner()
    inner.showMessage()
}
