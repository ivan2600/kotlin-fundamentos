package ejercicio_35_encapsulamiento

class Bateria {
    private var carga = 20

    fun cargar(porcentaje: Int) {
        if (validarCarga(porcentaje, "carga")) {
            carga += porcentaje
        } else {
            println("Error: porcentaje invalido")
        }
    }

    private fun validarCarga(p: Int, operacion: String): Boolean {
        if (p <= 0) return false
        return when (operacion) {
            "carga" -> carga + p <= 100
            "uso"   -> carga - p >= 0
            else -> false
        }
    }

    fun usar(porcentaje: Int) {
        if (validarCarga(porcentaje, "uso")) {
            carga -= porcentaje
        } else {
            println("Error: porcentaje invalido")
        }
    }

    fun nivelActual(): Int = carga
}

fun main() {
    val b = Bateria()

    b.cargar(50)
    println("Nivel actual: ${b.nivelActual()}%")
    b.usar(70)
    println("Nivel actual: ${b.nivelActual()}%")
}