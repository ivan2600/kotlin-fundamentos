package ejercicio_20_jornada_laboral

import java.time.LocalTime
import java.time.Duration
import java.time.format.DateTimeFormatter

fun main() {
    //CONFIGURACIÓN
    val horaInicio = LocalTime.of(7,0) // 07:00 hs
    val horaFin = LocalTime.of(16,0) // 16:00 hs

    //HORA ACTUAL
    val ahora = LocalTime.now()
    val formato = DateTimeFormatter.ofPattern("HH:mm")
    val horaLimpia = ahora.format(formato) ?: "--:--"

    //DURACIONES
    val totalJornada = Duration.between(horaInicio, horaFin).toMinutes()
    val trabajado = Duration.between(horaInicio, ahora).toMinutes()

    //EVITAR NUMEROS NEGATIVOS O MAYORES A LA JORNADA
    val trabajadoReal = trabajado.coerceIn(0,totalJornada)

    //CALCULO PORCENTAJE
    val porcentaje = (trabajadoReal.toDouble() / totalJornada.toDouble()) * 100
    val restante = totalJornada - trabajadoReal

    println("Hora actual: $horaLimpia")
    println("Porcentaje de jornada completado: ${ "%.2f".format(porcentaje) }%")
    println("Minutos restantes: $restante.")
    if (porcentaje > 90.0) println("El ultimo esfuerzo!") else if (porcentaje > 80) println("Ya falta poquito maestro!")

}