package ejercicio_36_encapsulamiento

class Motor {
    private var temperatura = 40

    fun aumentar(temp: Int) {
        if (validarCambio(temp, "aumentar")) {
            temperatura += temp
        } else {
            println("Error")
        }
    }

    private fun validarCambio(grados: Int, operacion: String): Boolean {
        if (grados <= 0) return false
        return when (operacion) {
            "aumentar" -> temperatura + grados <= 120
            "enfriar"   -> temperatura - grados >= 20
            else -> false
        }
    }

    fun enfriar(temp: Int) {
        if (validarCambio(temp, "enfriar")) {
            temperatura -= temp
        } else {
            println("Error")
        }
    }

    fun nivelActual(): Int = temperatura
}

fun main() {
    val m = Motor()

    m.aumentar(50)
    println("Nivel actual: ${m.nivelActual()}%")
    m.enfriar(70)
    println("Nivel actual: ${m.nivelActual()}%")
}