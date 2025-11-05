val triple = { x: Int -> x * 3 }
//val triple: (Int) -> Int = { it * 3 }  //version "COMPACTA"

val pares = { n: Int -> n % 2 == 0 }

val mayuscula = { a: String -> a.replaceFirstChar { it.uppercase() } }

const val string1 = "Hola"
const val string2 = "como estas?"
val masLarga = { a: String, b: String -> if (a.length > b.length) a else b }

val palabras = listOf("hola", "adios", "botella", "sol")
val filtrar = palabras.filter { it.length > 4 }

fun main() {

    println(triple(7))
    println(masLarga(string1, string2))
    println(filtrar)
    println(pares(4))
    println(pares(7))
    println(mayuscula(string2))

}