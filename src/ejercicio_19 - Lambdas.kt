val triple = { x: Int -> x * 3 }
//val triple: (Int) -> Int = { it * 3 }  //version "COMPACTA"

val pares = { n: Int -> n % 2 == 0 }

val mayuscula = { a: String -> a.replaceFirstChar { it.uppercase() } }

const val string1 = "Hola"
const val string2 = "como estas?"
val masLarga = { a: String, b: String -> if (a.length > b.length) a else b }

val palabras = listOf("hola", "adios", "botella", "sol")
val filtrar = palabras.filter { it.length > 4 }

val esLarga = { a: String -> a.length > 8 }

val esNegativo = { x: Int -> x < 0 }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

val numeros = listOf(5, -2, 10, 3, -8, 0, 12, -1)

val positivos = { x: Int -> x > 0 }
val transformar = { x: Int -> if (x > 0) x * 2 else if (x < 0) -x else 0 }
val filtrarPositivos = numeros.filter(positivos)
val transformarNumeros = numeros.map(transformar)


fun main() {

    println(triple(7))
    println(masLarga(string1, string2))
    println(filtrar)
    println(pares(4))
    println(mayuscula(string2))
    println(esLarga(string2))
    println(esNegativo(4))
    println("=============================================")
    println(filtrarPositivos)
    println(transformarNumeros)

}