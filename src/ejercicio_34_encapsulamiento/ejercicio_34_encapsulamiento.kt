package ejercicio_34_encapsulamiento

class Termometro {

    private var temperatura = 0

    fun setTemperatura(nuevaTemp: Int) {
        if (nuevaTemp in -50 .. 50) {
            temperatura = nuevaTemp
        } else {
            println("Temperatura fuera de rango")
        }
    }

    fun getTemperatura(): Int {
        return temperatura
    }
}

fun main() {

    val t = Termometro()

    t.setTemperatura(12)
    println(t.getTemperatura())

    t.setTemperatura(666)
    println(t.getTemperatura())

}