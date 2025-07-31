package com.example.myapplication

fun getUserName(): String? {
    return null // Simulate null value from external source
}

fun readSensor(): Double? {
    return null // simulate a failed reading
}


fun main() {

    //Example1

    val userName: String? = getUserName() // nullable
    println("Length: ${userName?.length}")
    val length = userName?.length ?: 0
    println("Length or 0: $length")

    //  (executes only if not null)
    userName?.let {
        println("Hello, $it")
    }

    //Example2
    val temperature: Double? = readSensor()

    println("Current temp: ${temperature ?: "Sensor error"}")

}

