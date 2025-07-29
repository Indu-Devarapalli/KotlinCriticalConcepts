package com.example.myapplication

object IDGenerator {
    private var lastId = 0

    fun getNextId(): Int {
        lastId += 1
        println("Generated new ID: $lastId")
        return lastId
    }

    fun reset() {
        lastId = 0
        println("ID Generator reset")
    }
}
fun main() {
    val gen1 = IDGenerator
    val gen2 = IDGenerator

    println(gen1.getNextId())
    println(gen2.getNextId())

    gen1.reset()

    println(gen2.getNextId())
}

