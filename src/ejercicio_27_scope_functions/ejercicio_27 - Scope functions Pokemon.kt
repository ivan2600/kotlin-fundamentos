data class Carta(
    var nombre: String,
    var poder: Int,
    var tipo: String,
    var coleccionada: Boolean
)

fun main() {

    val nombre = "Charmander"

    val cartaLet = nombre.let {
        Carta(
            nombre = it,
            poder = 50,
            tipo = "Fuego",
            coleccionada = false
        )
    }

    println(cartaLet)

    val cartaApply = Carta(
        nombre = "Squirtle",
        poder = 40,
        tipo = "Agua",
        coleccionada = false
    ).apply {
        poder += 10
        coleccionada = true
    }

    println(cartaApply)

    val resultadoRun = cartaApply.run {
        poder += 20
        "La carta $nombre ahora tiene $poder de poder."
    }
    println(resultadoRun)
    println(cartaApply)

    val resumenWith = with(cartaLet) {
        "Resumen: $nombre ($tipo) → poder $poder"
    }

    println(resumenWith)

    val cartaAlso = Carta("Pikachu", 60, "Eléctrico", false).also {
        println("Log: Creaste la carta de ${it.nombre}")
    }

    println(cartaAlso)

}