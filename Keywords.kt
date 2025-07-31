package com.example.myapplication

const val APP_NAME = "WeatherWatcher" //const
const val MAX_TEMP = 50

fun main() {

    val list = mutableListOf("Apple", "Banana")
    list.add("Cherry")  // val

    println(list)

    println("App: $APP_NAME")
    println("Max Temp Limit: $MAX_TEMP")
}
