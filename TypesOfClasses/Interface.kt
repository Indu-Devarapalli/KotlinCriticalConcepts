package com.example.myapplication

//Define the interface

interface Drivable {
    fun drive()
    fun stop()
    fun status(): String {
        return "Vehicle is ready to drive."
    }
}

//Create classes that implement it

class Cars : Drivable {
    override fun drive() {
        println("Driving a car on the road.")
    }

    override fun stop() {
        println("Car has stopped.")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("Pedaling the bicycle.")
    }

    override fun stop() {
        println("Bicycle has stopped.")
    }
}

class AutoRickshaw : Drivable {
    override fun drive() {
        println("Auto rickshaw starts with a jerk.")
    }

    override fun stop() {
        println("Auto rickshaw is halted.")
    }
}

fun main() {
    val vehicles: List<Drivable> = listOf(Cars(), Bicycle(), AutoRickshaw())

    for (vehicle in vehicles) {
        println(vehicle.status())
        vehicle.drive()
        vehicle.stop()
        println("----------")
    }
}
