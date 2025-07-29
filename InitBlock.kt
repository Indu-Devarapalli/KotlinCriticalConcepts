package com.example.myapplication


class Student(val name: String, val age: Int) {  //primary constructor

      var isTwins: Boolean = false
    // init block always runs after primary constructor
    init {
        println("Init block 1: Name = $name, Age = $age")
    }

    init {
        isTwins = true
        println("Init Block 2: They both are twins is $isTwins")
    }
    // Secondary constructor
    constructor(name: String) : this(name, 18) {
        println("Secondary constructor with default age")
    }
}

fun main() {
    val p1 = Student("Aadi", 18)
    println("Twins (p1): ${p1.isTwins}")

    println("----")

    val p2 = Student("Arjun")
    println("Twins (p2): ${p2.isTwins}")

}

