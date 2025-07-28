package com.example.myapplication
class NumberChecker {
    var number: Int = 0

    fun isPrime(): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }

    fun printResult() {
        if (isPrime()) {
            println("$number is a prime number.")
        } else {
            println("$number is not a prime number.")
        }
    }
}

fun main() {
    val checker = NumberChecker()
    checker.number = 29   // ✅ You can change this number to test different values
    checker.printResult()
}
