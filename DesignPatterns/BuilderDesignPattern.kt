package com.example.myapplication

class PatientRecord private constructor(
    val id: String,
    val name: String,
    val dateOfBirth: String,
    val diagnosis: String?,
    val roomNumber: String?
) {

    class Builder(
        private val id: String,
        private val name: String,
        private val dateOfBirth: String
    ) {
        private var diagnosis: String? = null
        private var roomNumber: String? = null

        fun diagnosis(diagnosis: String) = apply { this.diagnosis = diagnosis }
        fun roomNumber(roomNumber: String) = apply { this.roomNumber = roomNumber }

        fun build(): PatientRecord {
            return PatientRecord(id, name, dateOfBirth, diagnosis, roomNumber)
        }
    }

    override fun toString(): String {
        return """
            PatientRecord(
              id='$id',
              name='$name',
              dateOfBirth='$dateOfBirth',
              diagnosis=$diagnosis,
              roomNumber=$roomNumber
            )
        """.trimIndent()
    }
}
fun main() {
    val patient = PatientRecord.Builder("P001", "Alice Smith", "1985-04-12")
        .diagnosis("Fractured leg")
        .roomNumber("Ward 5B")
        .build()

    println(patient)
}
