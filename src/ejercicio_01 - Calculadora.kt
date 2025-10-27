fun  calculadora() {

    print("Ingrese el primer número: ")
    val primerNumero = readlnOrNull()?.toIntOrNull() ?: 1

    print("Ingrese un operador: ")
    val operador = readlnOrNull() ?: "+"

    print("Ingrese el segundo número: ")
    val segundoNumero = readlnOrNull()?.toIntOrNull() ?: 1
    if (operador == "/" && segundoNumero == 0) {
        println("ERROR")
    } else {
        when (operador) {
            "+" -> println("El resultado es: ${primerNumero + segundoNumero}")
            "-" -> println("El resultado es: ${primerNumero - segundoNumero}")
            "*" -> println("El resultado es: ${primerNumero * segundoNumero}")
            "/" -> println("El resultado es: ${primerNumero / segundoNumero}")
            else -> println("Operador no valido.")
        }
    }
}

fun main() {
    calculadora()
}