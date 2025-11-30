package ejercicio_49_adivina_el_numero

import kotlin.random.Random

fun main() {
    // 1. Definición de constantes y la elección del número
    val min = 1
    val max = 100
    // Genera un número aleatorio entre min y max (incluidos)
    val numeroSecreto = Random.nextInt(min, max + 1)

    var adivinado = false
    var intentos = 0

    println("🎉 ¡Bienvenido a Adivina el Número! 🎉")
    println("He elegido un número entre $min y $max. ¿Puedes adivinarlo?")
    println("---")

    // 2. Bucle principal del juego
    while (!adivinado) {
        intentos++

        // Manejo de la entrada del usuario
        print("Intento #$intentos: Introduce tu número: ")

        // Uso de try-catch para manejar entradas no válidas (no números)
        val entrada = readLine()
        val intento = entrada?.toIntOrNull()

        // 3. Validación de la entrada
        if (intento == null) {
            println("❌ Entrada no válida. Por favor, introduce solo números.")
            continue // Vuelve al inicio del bucle
        }

        // 4. Lógica del juego (pistas)
        when {
            intento < numeroSecreto -> {
                println("⬆️ ¡Demasiado bajo! Intenta con un número mayor.")
            }
            intento > numeroSecreto -> {
                println("⬇️ ¡Demasiado alto! Intenta con un número menor.")
            }
            else -> {
                // ¡Adivinó!
                adivinado = true
                println("\n🏆 ¡Felicidades! ¡Adivinaste el número $numeroSecreto en $intentos intentos!")
                println("¡Eres un crack de Kotlin!")
            }
        }
        println("---")
    }
}