package ejercicio_31_mate_o_cerveza

fun main() {
    val opciones = listOf("🍺 Cervecita", "🧉 Matecito")
    var cerveza = 0
    var mate = 0

    repeat(3) {
        val eleccion = opciones.random()
        println("Tirada ${it + 1}: $eleccion")

        if (eleccion.contains("Cerve")) cerveza++
        else mate++
    }

    println("\nGanador: " + if (cerveza > mate) "🍺 Cervecita" else "🧉 Matecito")
}
