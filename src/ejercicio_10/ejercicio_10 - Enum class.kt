package ejercicio_10

enum class EstadoEmail(val icono: String) {
    NUEVO("🆕"),
    LEIDO("✉️"),
    RESPONDIDO("📧")
}

fun main() {
    EstadoEmail.entries.forEachIndexed { index, estado ->
        println("[$index] $estado ${estado.icono}")
    }
}