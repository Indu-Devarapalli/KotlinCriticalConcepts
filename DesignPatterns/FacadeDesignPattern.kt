package com.example.myapplication

// Subsystem 1: Handles admitting a student
class StudentAdmission {
    fun admitStudent(studentName: String) {
        println("Admitting Student: $studentName")

    }
}

// Subsystem 2: Handles fee generation
class Fee {
    fun generateFee(studentName: String) {
        println("Generating fee for: $studentName")

    }
}

// Subsystem 3: Handles creating student records
class StudentRecord {
    fun createRecord(studentName: String) {
        println("Creating student record for: $studentName")

    }
}

// Subsystem 4: Handles dispensing books
class Books {
    fun dispenseBooks(studentName: String) {
        println("Dispensing books to: $studentName")

    }
}

// Facade class: Simplifies all subsystem interactions
class StudentFacade {
    private val admission = StudentAdmission()
    private val fee = Fee()
    private val records = StudentRecord()
    private val book = Books()

    // Single method that handles the entire admission process
    fun admitStudent(studentName: String) {
        admission.admitStudent(studentName)
        records.createRecord(studentName)
        fee.generateFee(studentName)
        book.dispenseBooks(studentName)
        println("Student $studentName admission process completed successfully.")
    }
}

// Client code
fun main() {
    val studentFacade = StudentFacade()

    // Using the facade to admit a student with one simple method call
    studentFacade.admitStudent("Krish")
}
