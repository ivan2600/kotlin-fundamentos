package ejercicio_30

data class Tarea(
    var titulo: String,
    var completada: Boolean,
    var prioridad: Int
)

fun main() {
    val tareas = listOf<Tarea>(
        Tarea("Limpiar pecera", false, 3).apply { prioridad = 2 }.also { println("Tarea agregada: ${it.titulo}") },
        Tarea("Ordenar cuarto", true, 2).apply { prioridad = 3 }.also { println("Tarea agregada: ${it.titulo}") },
        Tarea("Chequear el auto", false, 5).apply { completada = true }.also { println("Tarea agregada: ${it.titulo}") },
        Tarea("Comprar auxiliar", true, 1).apply { completada = false }.also { println("Tarea agregada: ${it.titulo}") },
        Tarea("Estudiar Kotlin", false, 4).apply { prioridad = 5 }.also { println("Tarea agregada: ${it.titulo}") }
    )

    val tareaLet = tareas[4].let {
        "→ ${it.titulo} (P${it.prioridad}) - completada: ${it.completada}"
    }

    val tareaRun = tareas[0].run {
        completada = true
        "La tarea ${this.titulo} ha sido marcada como completada"
    }

    val resumenWith = with(tareas[2]) {
        "Reporte: Título: ${this.titulo} Prioridad: ${this.prioridad} Completada: ${this.completada}"
    }

    val filtrarCompletadas = tareas.filter { it.completada }
    val filtrarPrioridadAlta = tareas.filter { it.prioridad >= 3 }

    println(tareaLet)
    println(tareaRun)
    println(resumenWith)
    println(filtrarCompletadas)
    println(filtrarPrioridadAlta)

}