package ejercicio_45_gestion_de_estudiantes

data class Estudiante (
    val nombre: String,
    val calificaciones: List<Double>
)

fun calcularPromedio(estudiante: Estudiante): Double = estudiante.calificaciones.average()

fun estudianteAprobado(estudiante: Estudiante): Boolean = calcularPromedio(estudiante) >= 6.0

fun mejorEstudiante(estudiantes: List<Estudiante>): Estudiante? {
    return estudiantes.maxByOrNull { calcularPromedio(it) }
}

fun main() {
    val estudiante1 = Estudiante(nombre="Ivan", calificaciones = listOf(10.0, 7.0, 2.0))
    val estudiante2 = Estudiante(nombre="Juan", calificaciones = listOf(10.0, 7.0, 6.0))
    val estudiante3 = Estudiante(nombre="Carlos", calificaciones = listOf(7.0, 5.0, 2.0))

    val estudiantes = listOf(estudiante1, estudiante2, estudiante3)

    for (estudiante in estudiantes) {
        val promedio = "%.2f".format(calcularPromedio(estudiante))
        val estado = if (estudianteAprobado(estudiante)) "APROBADO ✓" else "REPROBADO ✗"
        println("${estudiante.nombre} - Promedio: $promedio - $estado")
    }

    val mejor = mejorEstudiante(estudiantes)
    println("Mejor estudiante: ${mejor?.nombre} con promedio ${mejor?.let { calcularPromedio(it) }}")
}