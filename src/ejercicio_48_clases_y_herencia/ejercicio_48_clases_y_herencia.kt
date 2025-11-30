package ejercicio_48_clases_y_herencia

open class Personaje(
    val nombre: String
) {
    open fun atacar() {
        println("El personaje ataca.")
    }

    fun defender() {
        println("El personaje se defiende.")
    }
}

class Guerrero(nombre: String) : Personaje(nombre) {
    override fun atacar() {
        println("El guerrero $nombre ataca con su espada!")
    }
}

class Mago(nombre: String) : Personaje(nombre) {
    override fun atacar() {
        println("El mago $nombre lanza un hechizo!")
    }
}

class Arquero(nombre: String) : Personaje(nombre) {
    override fun atacar() {
        println("El arquero $nombre dispara una flecha!")
    }
}

fun main() {
    val personaje1 = Guerrero("Aragorn")
    val personaje2 = Mago("Gandalf")
    val personaje3 = Arquero("Legolas")

    personaje1.atacar()
    personaje1.defender()
    personaje2.atacar()
    personaje2.defender()
    personaje3.atacar()
    personaje3.defender()
}