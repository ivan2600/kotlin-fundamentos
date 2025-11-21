package ejercicio_29_scope_functions

data class Perfil(
    var nombre: String,
    var edad: Int,
    var online: Boolean
)

fun main() {

    val perfiles = listOf<Perfil>(
        Perfil("Matias", 32, false).apply { online = true }.also { println("Perfil agregado: ${it.nombre}") },
        Perfil("Florencia", 40, false).apply { edad = 41 }.also { println("Perfil agregado: ${it.nombre}") },
        Perfil("Tania", 36, false).apply { nombre = "Lorena"}.also { println("Perfil agregado: ${it.nombre}") },
        Perfil("Lucho", 34, false).apply { online = true }.also { println("Perfil agregado: ${it.nombre}") },
        Perfil("Cornelio", 62, false).apply { edad = 63 }.also { println("Perfil agregado: ${it.nombre}") }
    )

    val onlineUsers = perfiles.filter { it.online }
    val mayores = perfiles.filter { it.edad >= 35 }

    println("Usuarios online: $onlineUsers")
    println("Mayores de 35 años: $mayores")

    val resultadoRun = perfiles[0].run {
        online = false
        "El usuario ${this.nombre} ha sido desconectado manualmente"
    }

    println(resultadoRun)

    val resumen = perfiles[2].let {
        "Perfil → ${it.nombre}, ${it.edad} años, online: ${it.online}"
    }

    println(resumen)
}