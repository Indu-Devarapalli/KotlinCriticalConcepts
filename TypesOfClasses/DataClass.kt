package com.example.myapplication

//Example1
// Step 1: Define the data class
data class Product(
    val name: String,
    val price: Double,
    val stock: Int
)

//Example2
data class Loadout(
    val characterName: String,
    val level: Int,
    val weapon: String
)

fun main() {

    //Example1

    // Step 2: Create two identical products
    val p1 = Product("Headphones", 99.99, 50)
    val p2 = Product("Headphones", 99.99, 50)

    // equals() and hashCode()
    println("Are products equal? ${p1 == p2}")        // true (value-based)
    println("Hash codes: p1=${p1.hashCode()}, p2=${p2.hashCode()}")

    // toString()
    println("Product info: $p1")

    // copy()
    val discountedProduct = p1.copy(price = 79.99)
    println("Discounted product: $discountedProduct")

    // componentN() - destructuring
    val (name, price, stock) = discountedProduct
    println("Name: $name | Price: $price | Stock: $stock")

    // Use in a HashSet (uses hashCode and equals)
    val productSet = hashSetOf(p1, p2, discountedProduct)
    println("Product set size: ${productSet.size}")

    //Example2
    // Step 2: Create instances
    val loadout1 = Loadout("Shadow", 15, "Plasma Rifle")
    val loadout2 = Loadout("Shadow", 15, "Plasma Rifle")
    val loadout3 = Loadout("Viper", 20, "Sniper")

    // toString()
    println("Original Loadouts:")
    println(loadout1)  // Print readable object
    println(loadout3)

    // equals()
    println("Loadouts equal? ${loadout1 == loadout2}")  // true

    // hashCode()
    println("Hash codes: loadout1=${loadout1.hashCode()}, loadout3=${loadout3.hashCode()}")

    // copy()
    val upgradedLoadout = loadout1.copy(level = 16)
    println("Upgraded Loadout: $upgradedLoadout")

    // componentN() — destructuring
    val (name1, level, weapon) = upgradedLoadout
    println("Destructured: Name = $name1, Level = $level, Weapon = $weapon")

    // Bonus: Store in HashSet (uses hashCode and equals)
    val loadoutSet = hashSetOf(loadout1, loadout2, loadout3, upgradedLoadout)
    println("Unique Loadouts in Set: ${loadoutSet.size}")
}
