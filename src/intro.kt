fun main() {
    val calificaciones = listOf<Double>(8.5, 9.0, 7.5, 10.0)

    fun calcularPromedio(lista: List<Double>): Double {
        var acumulado = 0.0
        for (nota in lista) {
            acumulado += nota
        }
        val promedio: Double = acumulado / lista.size
        return promedio
    }

    println("El promedio es ${calcularPromedio(calificaciones)}")
}