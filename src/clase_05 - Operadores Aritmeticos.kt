fun main() {

    val emailsRecibidos = 25
    val emailsEnviados = 15
    val emailsEliminados = 3

    val totalEmails = emailsRecibidos + emailsEnviados
    val diferencia = emailsRecibidos - emailsEnviados
    val dobleEmails = emailsRecibidos * 2
    val promedio = totalEmails / 2
    val residuo = emailsRecibidos % 7

    println("Total: $totalEmails, Promedio: $promedio, Residuo: $residuo")

    val calculo = 10 + 5 * 2
    println("El resultado es: $calculo")

    val calculo2 = (10 + 5) * 2
    println("El resultado es: $calculo2")

    var contador = 10
    contador += 1
    println("Contador: $contador")
    contador -= 3
    println("Contador: $contador")
    contador *= 4
    println("Contador: $contador")
    contador /= 2
    println("Contador: $contador")
    contador %= 2
    println("Contador: $contador")

    //EJERCICIO
    val emailsAyer = 8
    val emailsHoy = 12
    val incrementoEnPorcentaje = ((emailsHoy - emailsAyer).toFloat() / emailsHoy) * 100
    println("Incremento de emails: $incrementoEnPorcentaje%")

}
