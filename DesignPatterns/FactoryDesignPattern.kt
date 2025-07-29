package com.example.myapplication

// Step 1: Common interface for all types of Pizza
interface Pizza {
    fun prepare()
    fun bake()
    fun box()
}

// Step 2: Concrete class for Cheese Pizza
class CheesePizza : Pizza {
    override fun prepare() = println("Preparing Cheese Pizza")
    override fun bake() = println("Baking Cheese Pizza")
    override fun box() = println("Boxing Cheese Pizza")
}

// Step 3: Concrete class for Veggie Pizza
class VeggiePizza : Pizza {
    override fun prepare() = println("Preparing Veggie Pizza")
    override fun bake() = println("Baking Veggie Pizza")
    override fun box() = println("Boxing Veggie Pizza")
}

// Step 4: Concrete class for Pepperoni Pizza
class PepperoniPizza : Pizza {
    override fun prepare() = println("Preparing Pepperoni Pizza")
    override fun bake() = println("Baking Pepperoni Pizza")
    override fun box() = println("Boxing Pepperoni Pizza")
}

// Step 5: Factory class to create Pizza objects based on the type
class PizzaFactory {
    // Factory method to return the correct Pizza object
    fun createPizza(type: String): Pizza? {
        return when(type.lowercase()) {
            "cheese" -> CheesePizza()       // Returns CheesePizza object
            "veggie" -> VeggiePizza()       // Returns VeggiePizza object
            "pepperoni" -> PepperoniPizza() // Returns PepperoniPizza object
            else -> null                    // Returns null if type doesn't match
        }
    }
}

// Step 6: Main function (client code)
fun main() {
    val factory = PizzaFactory()       // Create an instance of PizzaFactory

    val pizzaType = "Veggie"
    val pizza = factory.createPizza(pizzaType)
    if (pizza != null) {

        pizza.prepare()
        pizza.bake()
        pizza.box()
    } else {

        println("Sorry, we don’t have that pizza type.")
    }
}
