package ejercicio_22_funciones_de_alto_orden

fun procesarNumero(n: Int, operacion: (Int) -> Int) {
    println(operacion(n))
}

val alCuadrado = { x: Int -> x * x }
val  masDiez = { x: Int -> x + 10 }

fun main() {

    procesarNumero(4, alCuadrado)
    procesarNumero(5, masDiez)

}