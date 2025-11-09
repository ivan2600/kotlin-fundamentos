package ejercicio_13

enum class NivelDeBateria(val icono: String, val mensaje: String) {
    ALTO("🔋", "Carga completa, todo OK"),
    MEDIO("🔋", "Nivel medio, podrías cargar pronto"),
    BAJO("🪫", "Batería baja, conectar cargador");

    fun mostrarEstado() {
        println("$icono $name → $mensaje")
    }
}

// 🧩 Función que valida que el número esté entre 1 y 100
fun pedirNumeroValido(): Int? {
    while (true) {
        print("Ingrese un número del 1 al 100: ")
        val numero = readlnOrNull()?.toIntOrNull()
        if (numero in 1..100) {
            return numero // ✅ Devuelve el número válido
        } else {
            // 🔴 Texto rojo para avisar el error
            println("\u001B[31mEntrada inválida. Intente nuevamente.\u001B[0m\n")
        }
    }
}

fun main() {
    val numero = pedirNumeroValido() // 🔁 Se repite hasta que el usuario ingrese un número válido

    val nivel = when (numero) {
        in 80..100 -> NivelDeBateria.ALTO
        in 41..79 -> NivelDeBateria.MEDIO
        else -> NivelDeBateria.BAJO
    }

    nivel.mostrarEstado()
}
