package ejercicio_39_vocales_en_palabras

import kotlin.text.iterator

fun main() {
    print("Ingrese una palabra: ")
    val palabra = readln().lowercase()

    val vocales = "aeiou"
    var contador = 0

    for (letra in palabra) {
        if (letra in vocales) {
            contador++
        }
    }

    println("La palabra tiene $contador vocales.")
}
