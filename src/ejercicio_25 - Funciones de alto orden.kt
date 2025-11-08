val palabras = listOf("kotlin", "perro", "sol", "computadora", "mate", "programar")

fun filtrarYModificarStrings( lista: List<String>, filtro: (String) -> Boolean, transformacion: (String) -> String): List<String> {
    return lista.filter(filtro).map(transformacion)
}

val esLargo = { palabra: String -> palabra.length > 5 }
val empiezaConP = { palabra: String -> palabra.startsWith("p", ignoreCase = true) }
val todoMayus = { palabra: String -> palabra.uppercase() }
val invertir = { palabra: String -> palabra.reversed() }

fun main() {

    println(filtrarYModificarStrings(palabras, esLargo, todoMayus))
    println(filtrarYModificarStrings(palabras, empiezaConP, invertir))

}