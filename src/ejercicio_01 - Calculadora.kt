fun  sumar() {

    println("Ingrese el primer número: ")
    val primerNumero = readlnOrNull()?.toIntOrNull() ?: 1

    println("Ingrese el segundo número: ")
    val segundoNumero = readlnOrNull()?.toIntOrNull() ?: 1

    println("El resultado de la suma es: ${primerNumero + segundoNumero}")

}


fun main() {

    sumar()
}