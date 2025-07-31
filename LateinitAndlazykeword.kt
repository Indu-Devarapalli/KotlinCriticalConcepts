package com.example.myapplication

class HomeController {
    //lateinit
    lateinit var deviceName: String  // Will be set during device scan

    //lazy
    val systemSummary: String by lazy {
        println("Loading system summary...")
        "Total devices: 15, Active: 12, Inactive: 3"
    }

    fun detectDevice(name: String) {   //lateinit
        deviceName = name
    }

    fun printDeviceStatus() {  //lateinit
        if (::deviceName.isInitialized) {
            println("Connected to: $deviceName")
        } else {
            println("No device connected.")
        }
    }

    //lazy
    fun showSummary() {
        println(systemSummary)
    }
}

fun main() {
    //lateinit
    val controller = HomeController()
    controller.printDeviceStatus()
    controller.detectDevice("Smart Thermostat")
    controller.printDeviceStatus()

    println("Accessing summary:") //lazy
    controller.showSummary()
    controller.showSummary()
}
