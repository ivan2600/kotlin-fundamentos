package ejercicio_47_clases_y_herencia

open class Vehiculo(
    val marca: String
) {
    open fun arrancar() {
        println("El vehiculo esta arrancando...")
    }
}

class Auto(marca: String) : Vehiculo(marca) {
    override fun arrancar() {
        println("El auto $marca está arrancando...")
    }
}

class Moto(marca: String) : Vehiculo(marca) {
    override fun arrancar() {
        println("La moto $marca está arrancando...")
    }
}

class Camion(marca: String) : Vehiculo(marca) {
    override fun arrancar() {
        println("El camión $marca está arrancando...")
    }
}

fun main() {
    val flota = listOf<Vehiculo>(
        Camion("Mercedes Benz"),
        Auto("Chevrolet"),
        Moto("Honda"),
        Camion("Iveco")
    )

    for (vehiculo in flota) {
        vehiculo.arrancar()
    }
}