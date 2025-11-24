package ejercicio_21_no_fumar

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.Duration
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val hoy = LocalDateTime.now()
    val dejeDeFumar = LocalDateTime.of(2025, 9, 18, 0, 0, 0)

    val duracion = Duration.between(dejeDeFumar, hoy)

    val dias = duracion.toDays()
    val horas = duracion.toHours() % 24
    val minutos = duracion.toMinutes() % 60
    val segundos= duracion.toSeconds() % 60

    val cigarrillosPorDia = 20.0
    val cigarrillosPorSegundo = cigarrillosPorDia / 86400
    val cigarrillosNoFumados = cigarrillosPorSegundo * (duracion.toSeconds())
    val cigarrillosNoFumadosSinDecimales = BigDecimal(cigarrillosNoFumados).setScale(2, RoundingMode.HALF_UP)

    val precioAtado = 3000.0
    val cigarrillosPorAtado = 20
    val precioCigarrillo = precioAtado/cigarrillosPorAtado
    val dineroAhorrado = precioCigarrillo * cigarrillosNoFumados
    val dineroAhorradoSinDecimales = BigDecimal(dineroAhorrado).setScale(2, RoundingMode.HALF_UP)


    val formateado = DateTimeFormatter.ofPattern("dd-MM-yy / HH:mm")
    val fechaHoraLimpia = hoy.format(formateado)
    val dejeDeFumarLimpio = dejeDeFumar.format(formateado)
    println("Hoy es :$fechaHoraLimpia")
    println("Dejé de fumar: $dejeDeFumarLimpio")
    println("Libre de humos: ")
    println("$dias días $horas horas $minutos minutos $segundos segundos")
    println("Cigarrillos no fumados: $cigarrillosNoFumadosSinDecimales")
    println("Dinero Ahorrado: $$dineroAhorradoSinDecimales")
}