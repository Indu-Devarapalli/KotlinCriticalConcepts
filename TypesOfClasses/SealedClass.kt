package com.example.myapplication

//Example1

//Define the sealed class and possible states
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val errorMessage: String) : ApiResponse()
    object Loading : ApiResponse()
}

//Use it in a function

fun fetchUserData(response: ApiResponse) {
    when (response) {
        is ApiResponse.Success -> println("Data: ${response.data}")
        is ApiResponse.Error -> println("Error: ${response.errorMessage}")
        ApiResponse.Loading -> println("Loading data...")
    }
}

//Example2

sealed class GameEvent {
    data class Attack(val damage: Int) : GameEvent()
    data class Heal(val amount: Int) : GameEvent()
    data class LevelUp(val newLevel: Int) : GameEvent()
    object GameOver : GameEvent()
}

fun handleEvent(event: GameEvent) {
    when (event) {
        is GameEvent.Attack -> println("Player attacked with ${event.damage} damage!")
        is GameEvent.Heal -> println("Player healed for ${event.amount} HP!")
        is GameEvent.LevelUp -> println("Player leveled up to ${event.newLevel}!")
        GameEvent.GameOver -> println("Game Over! Try again?")
    }
}



fun main() {

    //Example1

    val successResponse = ApiResponse.Success("User profile loaded")
    val errorResponse = ApiResponse.Error("Network error")
    val loadingResponse = ApiResponse.Loading

    fetchUserData(successResponse)
    fetchUserData(errorResponse)
    fetchUserData(loadingResponse)

    //Example2

    val events = listOf(
        GameEvent.Attack(20),
        GameEvent.Heal(15),
        GameEvent.LevelUp(5),
        GameEvent.GameOver
    )
    for (event in events) {
        handleEvent(event)
    }
}