fun  sumar() {

    print("Ingrese el primer número: ")
    val primerNumero = readlnOrNull()?.toIntOrNull() ?: 1

    print("Ingrese el segundo número: ")
    val segundoNumero = readlnOrNull()?.toIntOrNull() ?: 1

    print("Ingrese un operador: ")
    val operador = readlnOrNull()?.toIntOrNull() ?: "+"

    when (operador) {
        "+" -> println("El resultado es: ${primerNumero + segundoNumero}")
        "-" -> println("El resultado es: ${primerNumero - segundoNumero}")
    }


}


fun main() {

    sumar()
}