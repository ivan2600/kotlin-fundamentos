package ejercicio_28_scope_functions

data class Perfil(
    var nombre: String,
    var edad: Int,
    var online: Boolean
)

fun main() {

    val nombre = "Ivan"

    val perfilLet = nombre.let {
        Perfil(
            nombre = it,
            edad = 34,
            online = false
        )
    }

    println(perfilLet)

    perfilLet.apply {
        edad = 21
        online = true
    }

    println(perfilLet)

    val resultadoRun = perfilLet.run {
        online = false
        "El usuario Iván ahora está desconectado"
    }

    println(resultadoRun)

    val resultadoAlso = perfilLet.also {
        println("Probando la funcion ALSO")
    }

    println(resultadoAlso)
}




