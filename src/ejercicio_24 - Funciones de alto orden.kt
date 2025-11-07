val lista = listOf<Int>(3, 2, -5, 8, -1, 9, 4)

fun filtrarYTransformar(lista: List<Int>, filtro: (Int) -> Boolean, transformacion: (Int) -> Int): List<Int> {
    return lista.filter(filtro).map(transformacion)
}

val esPar = { x: Int -> (x % 2) == 0 }
val esMultiploDeTres = { x: Int -> (x % 3) == 0 }
val alTriple = { x: Int -> x * 3 }
val alNegativo = { x: Int -> if (x > 0) { x - (x * 2) } else x }


fun main() {
    println(filtrarYTransformar(lista, esPar, alTriple))
    println(filtrarYTransformar(lista, esMultiploDeTres, alNegativo))
}