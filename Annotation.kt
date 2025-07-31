package com.example.myapplication

// @JvmStatic
class MyUtils {
    companion object {
        // Kotlin function exposed as static in Java
        @JvmStatic
        fun sayHello() {
            println("Hello from Kotlin")
        }

        fun sayHi() {
            println("Hi from Kotlin (non-static)")
        }
    }
}

// @JvmOverloads
class Logger {
    @JvmOverloads
    fun log(message: String, level: String = "INFO", deviceId: String = "Unknown") {
        println("[$level][$deviceId] $message")
    }
}

//@JvmField
class Config {
    companion object {
        @JvmField
        val appName = "SmartSystem"

        val version = "1.0.0" // No @JvmField — will have getter
    }
}


fun main(){

    // @JvmStatic
    MyUtils.sayHello()
    MyUtils.sayHi()

    // @JvmOverloads

    val logger = Logger()
    logger.log("Sensor offline")
    logger.log("Battery low", "WARNING")

    //  @JvmField

    println(Config.appName)
    println(Config.version)

}
