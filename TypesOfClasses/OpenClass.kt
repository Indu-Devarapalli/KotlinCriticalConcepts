package com.example.myapplication

//Example 1
// This class can be inherited now
open class Vehicle(val name: String) {
    open fun start() {
        println("$name is starting...")
    }

    fun stop() {
        println("$name is stopping.")
    }
}

//Create subclasses that inherit from Vehicle
class Car(name: String) : Vehicle(name) {
    override fun start() {
        println("$name (Car) is starting with a key.")
    }
}

class Bike(name: String) : Vehicle(name) {
    override fun start() {
        println("$name (Bike) is starting with a kick.")
    }
}

//Example2

//Create an open base class
open class Payment(val amount: Double) {
    open fun processPayment() {
        println("Processing a generic payment of $$amount.")
    }
}

//Create specific payment classes that extend Payment

class CreditCardPayment(amount: Double, val cardNumber: String) : Payment(amount) {
    override fun processPayment() {
        println("Processing credit card payment of $$amount using card: $cardNumber")
    }
}

class PayPalPayment(amount: Double, val email: String) : Payment(amount) {
    override fun processPayment() {
        println("Processing PayPal payment of $$amount for account: $email")
    }
}


fun main() {

    //example1
    val myCar = Car("Toyota")
    val myBike = Bike("Yamaha")

    myCar.start()
    myBike.start()

    myCar.stop()
    myBike.stop()

    //Example2

    val payment1: Payment = CreditCardPayment(150.0, "1234-5678-9012-3456")
    val payment2: Payment = PayPalPayment(89.99, "indu@gmail.com")

    payment1.processPayment()
    payment2.processPayment()

}