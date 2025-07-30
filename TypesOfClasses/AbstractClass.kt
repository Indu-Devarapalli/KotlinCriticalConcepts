package com.example.myapplication

//Define abstract class

abstract class BankAccount(val accountNumber: String, var balance: Double) {

    abstract fun calculateInterest(): Double

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $$amount. New balance: $$balance")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance: $$balance")
        } else {
            println("Insufficient funds!")
        }
    }
}
//Create concrete subclasses

class SavingsAccount(accountNumber: String, balance: Double) : BankAccount(accountNumber, balance) {
    override fun calculateInterest(): Double {
        return balance * 0.04  // 4% interest
    }
}

class CheckingAccount(accountNumber: String, balance: Double) : BankAccount(accountNumber, balance) {
    override fun calculateInterest(): Double {
        return balance * 0.01  // 1% interest
    }
}
fun main() {
    val savings = SavingsAccount("SAV123", 1000.0)
    val checking = CheckingAccount("CHK456", 2000.0)

    savings.deposit(500.0)
    checking.withdraw(300.0)

    println("Savings interest: \$${savings.calculateInterest()}")
    println("Checking interest: \$${checking.calculateInterest()}")
}
