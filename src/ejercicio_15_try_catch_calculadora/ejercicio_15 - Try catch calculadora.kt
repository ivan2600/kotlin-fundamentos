package ejercicio_15_try_catch_calculadora

fun  calculadora2() {

    print("Ingrese el primer número: ")
    val primerNumero = readlnOrNull()?.toIntOrNull() ?: 1

    print("Ingrese el segundo número: ")
    val segundoNumero = readlnOrNull()?.toIntOrNull() ?: 1

    try {
        println("El resultado es: ${ primerNumero / segundoNumero }")
    } catch (e:ArithmeticException) {
        println("ERROR: NO SE PUEDE DIVIDIR POR CERO.")
    }

}

fun main() {
    calculadora2()
}