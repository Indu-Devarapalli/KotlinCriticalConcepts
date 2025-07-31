package com.example.myapplication

//public Getter and Setters Example
class BankAccount1 {
    var balance: Double = 0.0
        set(value) {  //setter
            field = if (value >= 0) value else 0.0 // Prevent negative balance
        }
}
//Public Getter and Private Setter

class Package {
    var status: String = "Pending"
        private set  // this class can update the status

    fun updateStatus(newStatus: String) {
        // Control how the status can change
        if (newStatus in listOf("In Transit", "Delivered", "Cancelled")) {
            status = newStatus
        }
    }
}
//Custom Getter/Setter

class AirQualitySensor {
    var pm25: Int = 0
        get() {
            println("Getting PM2.5 value...")
            return field
        }
        set(value) {
            println("Setting PM2.5 to $value")
            field = if (value < 0) 0 else if (value > 500) 500 else value
        }

    fun displayStatus() {
        println("Air quality (PM2.5): $pm25 µg/m³")
    }
}

fun main() {

    //public Getter and Setters Example

    val account = BankAccount1()
    account.balance = 100.0
    println(account.balance)

    account.balance = -50.0
    println(account.balance) // (setter prevented negative value)

    //Public Getter and Private Setter

    val packageItem = Package()

    println("Current status: ${packageItem.status}")  // Allowed (getter is public)
    packageItem.updateStatus("In Transit")            // Setter used internally
    println("Updated status: ${packageItem.status}")

    //Custom Getter/Setter

    val sensor = AirQualitySensor()

    sensor.pm25 = 80              //  Normal value
    sensor.displayStatus()

    sensor.pm25 = -20
    sensor.displayStatus()

    sensor.pm25 = 700             // above range
    sensor.displayStatus()
}
