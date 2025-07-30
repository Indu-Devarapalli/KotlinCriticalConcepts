package com.example.myapplication

class SmartLight(val id: String) {
    var isOn: Boolean = false
    var brightness: Int = 0

    fun turnOn() {
        isOn = true
        println("Light $id is ON")
    }

    fun changeBrightness(level: Int) {
        brightness = level
        println("Brightness set to $brightness%")
    }

    override fun toString(): String = "SmartLight(id='$id', isOn=$isOn, brightness=$brightness)"
}

fun main() {
    val light = SmartLight("LIGHT001")
    val uiRef = light  // Same object reference

    light.turnOn()
    uiRef.changeBrightness(75)

    println("From UI: $uiRef")
    println("From Main: $light")

    val newLight = SmartLight("LIGHT001")
    println("Same reference? ${light === newLight}") 
}
