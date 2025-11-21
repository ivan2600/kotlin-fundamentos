package ejercicio_40_encapsulamiento_caja_fuerte

class CajaFuerte {
    private var codigo = 1234

    fun cambiarCodigo(nuevo: Int) {
        if (nuevo in 1000 .. 9999) {
            codigo = nuevo
        } else {
            println("Código invalido")
        }
    }

    fun abrir(intento: Int): Boolean {
        return intento == codigo
    }

    fun verCodigo(): String {
        return "Acceso denegado"
    }
}

fun main() {
    val caja = CajaFuerte()

    println(caja.abrir(1234))
    println(caja.abrir(9999))

    caja.cambiarCodigo(555)
    caja.cambiarCodigo(5678)

    println(caja.abrir(5678))

    println(caja.verCodigo())
}