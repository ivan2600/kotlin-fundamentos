fun main() {
    val cadena : String = "Ivan"
    val caracter : Char = 'I'
    val entero : Int = 26
    val decimal : Double = 26.0
    val flotante : Float = 26.0f
    val booleano : Boolean = true

    val conversionATexto = entero.toString()
    val conversionANumero = conversionATexto.toInt()

    val nombre = "Maria"
    val recibidos = 8
    val enviados= 2
    val porcentajeEnviados = (enviados.toFloat() / (recibidos + enviados)) * 100
    println("$nombre  - Enviados: $porcentajeEnviados%")

}