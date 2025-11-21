package ejercicio_32_scope_functions

data class Usuario(
    var nombre: String,
    var edad: Int,
    var online: Boolean
)

fun main() {
    val usuario1 = Usuario("Ivan", 34, false).apply { edad = 35
        online = true }.also { println("Creando usuario: ${it.nombre}") }

    val menmsajeRun = usuario1.run {
        online = false
        "El usuario ${this.nombre} ha sido desconectado"
    }

    val resumenLet = usuario1.let {
        "Usuario: ${it.nombre} (${it.edad}) - online: ${it.online}"
    }

    println(usuario1)
    println(menmsajeRun)
    println(resumenLet)
}