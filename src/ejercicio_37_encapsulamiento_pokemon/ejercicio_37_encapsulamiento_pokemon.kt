package ejercicio_37_encapsulamiento_pokemon

class Pokemon {

    private var energia = 50
    private var dormido = false

    fun atacar(consumo: Int) {
        if (validarAtaque(consumo)) {
            energia -= consumo
            if (energia < 10) dormido = true
        }
    }

     private fun validarAtaque(consumo: Int): Boolean {
        return (consumo > 0) && (consumo <= energia) && !dormido
    }

    fun descansar(tiempo: Int) {
        val energiaTiempo = tiempo * 10
        if ((energiaTiempo + energia) <= 100) {
            energia += energiaTiempo
        }
        if (energia > 50) dormido = false
    }

    fun estado(): String {
        return "Energia: $energia | Dormido: $dormido"
    }
}

fun main() {
    val pikachu = Pokemon()

    pikachu.atacar(30)
    println(pikachu.estado())    // Energía: 20 | Dormido: false

    pikachu.atacar(15)
    println(pikachu.estado())    // Energía: 5 | Dormido: true

    pikachu.descansar(5)
    println(pikachu.estado())    // Energía: 35 | Dormido: false
}