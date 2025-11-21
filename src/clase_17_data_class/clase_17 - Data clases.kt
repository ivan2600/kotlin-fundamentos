package clase_17_data_class

class EmailNormal (
    val asunto: String,
    val remitente: String,
    var leido: Boolean
)

data class EmailData (
    val asunto: String,
    val remitente: String,
    var leido: Boolean
)

fun main() {
    val emailNormal1 = EmailNormal(asunto = "Reunion", remitente = "ivan@hotmail.com", leido = false)
    val emailNormal2 = EmailNormal(asunto = "Reunion", remitente = "ivan@hotmail.com", leido = false)

    val emailData1 = EmailData(asunto = "Reunion", remitente = "ivan@hotmail.com", leido = false)
    val emailData2 = EmailData(asunto = "Reunion", remitente = "ivan@hotmail.com", leido = false)

    println("Clase normal: $emailNormal1")
    println("Data Clase: $emailData1")

    println("Comparación Clase normal: ${ emailNormal1 == emailNormal2 }")
    println("Comparación Data Clase: ${ emailData1 == emailData2 }")

    val emailCopia = emailData1.copy(asunto = "Copia")
    println("Esto es una copia: $emailCopia")

    //Destructuring
    val (asunto, remitente, leido) = emailCopia
    println("Asunto: $asunto | Remitente: $remitente | Leido: $leido")

    println("HashCode emailData1: ${ emailData1.hashCode() }")
    println("HashCode emailData2: ${ emailData2.hashCode() }")
}