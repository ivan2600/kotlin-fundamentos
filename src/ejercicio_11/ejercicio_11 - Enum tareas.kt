package ejercicio_11

enum class EstadoTareas(val icono: String, val mensaje: String) {
    PENDIENTE("⏳", "La tarea está sin iniciar."),
    EN_PROGRESO("⚙️", "La tarea está en proceso de ser completada."),
    COMPLETADA("✅", "La tearea fué completada con éxito."),
    CANCELADA("❌", "La tarea no será realizada.");

    fun mostrarEstado() {
        println("Estado seleccionado $name $icono")
        println(mensaje)
    }
}

fun main() {
    println("Ingrese el número del estado de su tarea:")
    println("0 - Pendiente")
    println("1 - En progreso")
    println("2 - Completada")
    println("3 - Cancelada")

    val valorEstado = readlnOrNull()?.toIntOrNull()

    if (valorEstado != null && valorEstado in EstadoTareas.entries.indices) {
        EstadoTareas.entries[valorEstado].mostrarEstado()
    } else {
        println("Número inválido 😅")
    }
}
