package ejercicio_14_volver_a_preguntar

fun solicitarNumero(): Int {
    while (true) {
        print("Ingrese un numero del 1 al 10: ")
        val numero = readlnOrNull()?.toIntOrNull()
        if (numero != null && numero in 1 .. 10) {
            return numero
        } else {
            println("Valor invalido o fuera de rango.")
        }
    }
}


fun main() {
    val numeroSolicitado = solicitarNumero()
    println("El número $numeroSolicitado está dentro del rango solicitado, al fin hijo de puta!")
}