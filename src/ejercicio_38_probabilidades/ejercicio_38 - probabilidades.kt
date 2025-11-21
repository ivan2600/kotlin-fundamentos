package ejercicio_38_probabilidades

import kotlin.random.Random

data class Pokemon(
    val nombre: String,
    val emoji: String,
    val probabilidad: Int       // Representa el porcentaje
)

fun main() {

    val pokemons = listOf(
        Pokemon("Charmander", "🔥", 30),
        Pokemon("Squirtle", "💧", 30),
        Pokemon("Bulbasaur", "🌱", 20),
        Pokemon("Pikachu", "⚡", 10),
        Pokemon("Metapod", "🐛", 6),
        Pokemon("Kadabra", "🔮", 4)
    )

    // Paso 1: generar un número del 1 al 100
    val random = Random.nextInt(1, 101)
    var acumulado = random

    // Paso 2: iterar por la lista y restar probabilidades
    val elegido = pokemons.first { pokemon ->
        if (acumulado <= pokemon.probabilidad) {
            true
        } else {
            acumulado -= pokemon.probabilidad
            false
        }
    }

    // Paso 3: mostrar el resultado
    println("Número generado: $random")
    println("Pokémon elegido: ${elegido.emoji} ${elegido.nombre}")

    // Mensajes especiales opcionales
    when(elegido.nombre) {
        "Charmander" -> println("🔥 El que eligen todos")
        "Squirtle" -> println("💧 El que eligen algunos")
        "Bulbasaur" -> println("🌱 El que no elige nadie")
        "Pikachu" -> println("⚡ El que aman todos")
        "Metapod" -> println("🐛 Más duro que el Chano")
        "Kadabra" -> println("🔮 Mi favorito de la infancia <3")
    }
}
