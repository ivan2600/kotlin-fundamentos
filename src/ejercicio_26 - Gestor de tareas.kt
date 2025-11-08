data class Tarea(
    val descripcion: String,
    var prioridad: Int,
    var completada: Boolean
)

val tareas = listOf(
    Tarea("Lavar los platos", 3, false),
    Tarea("Estudiar Kotlin", 5, false),
    Tarea("Comprar pan", 2, true),
    Tarea("Ordenar el cuarto", 4, false),
    Tarea("Sacar la basura", 1, true)
)

fun procesarTareas(
    lista: List<Tarea>,
    filtro: (Tarea) -> Boolean,
    transformacion: (Tarea) -> Tarea
): List<Tarea> {
    return lista.filter(filtro).map(transformacion)
}

val soloPendientes = { tarea: Tarea -> !tarea.completada }
val soloPrioridadAlta = { tarea: Tarea -> tarea.prioridad > 3 }
val marcarComoCompletada = { tarea: Tarea -> tarea.completada = true }
val bajarPrioridad = { tarea: Tarea -> if (tarea.prioridad > 1) tarea.prioridad -- }

fun main() {
    bajarPrioridad(tareas[4])
    println(tareas[0])
}