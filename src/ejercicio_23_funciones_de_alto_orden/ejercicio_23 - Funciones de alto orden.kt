package ejercicio_23_funciones_de_alto_orden

val listaNumeros = listOf<Int>(1, 2, 3, 7, 8, 9)

fun procesarLista(lista: List<Int>, operacion: (Int) -> Int): List<Int> {
    return lista.map(operacion)
}

val doble = { x: Int -> x * 2 }
val alCuadrado1 = { x: Int -> x * x }

fun main() {
println(procesarLista(listaNumeros, doble))
println(procesarLista(listaNumeros, alCuadrado1))

}