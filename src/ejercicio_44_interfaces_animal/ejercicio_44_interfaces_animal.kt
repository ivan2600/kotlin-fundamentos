package ejercicio_44_interfaces_animal

interface Animal {
    fun hacerSonido(): String
}

class Perro: Animal {
    override fun hacerSonido(): String {
        return "Guau!"
    }
}

class Gato: Animal {
    override fun hacerSonido(): String {
        return "Miau!"
    }
}

fun main() {
    val listaDeAnimales = mutableListOf<Animal>()
    listaDeAnimales.add(Perro())
    listaDeAnimales.add(Gato())

    for (animal in listaDeAnimales) {
        println(animal.hacerSonido())
    }
}


