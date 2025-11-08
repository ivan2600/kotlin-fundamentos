data class Tarea(
    var descripcion: String,
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

// ✅ usando copy()
val marcarComoCompletada = { tarea: Tarea ->
    tarea.copy(completada = true)
}

// ✅ usando copy()
val bajarPrioridad = { tarea: Tarea ->
    tarea.copy(prioridad = if (tarea.prioridad > 1) tarea.prioridad - 1 else 1)
}

// ✅ usando copy()
val aDescripcionLarga = { tarea: Tarea ->
    tarea.copy(descripcion = tarea.descripcion.uppercase())
}

fun main() {
    println(procesarTareas(tareas, soloPendientes, marcarComoCompletada))
    println(procesarTareas(tareas, soloPrioridadAlta, aDescripcionLarga))
    println(procesarTareas(tareas, { true }, bajarPrioridad))
}
