package ejercicio_12

import kotlinx.coroutines.*

enum class Semaforo(val icono: String, val duracion: Int, val mensaje: String) {
    ROJO("🔴", 3, "Detenerse, no avanzar"),
    AMARILLO("🟡", 1, "Precaución, pronto cambiará"),
    VERDE("🟢", 3, "Avanzar con cuidado");

    fun mostrarEstado(segundosRestantes: Int) {
        // \r vuelve al principio de la línea y print no hace salto de línea
        print("\r$icono $name (${duracion}s) → $mensaje [$segundosRestantes]   ")
    }
}

fun main() = runBlocking {
    while (true) {
        for (estado in Semaforo.entries) {
            for (i in estado.duracion downTo 1) {
                estado.mostrarEstado(i)
                delay(1000)
            }
        }
    }
}
