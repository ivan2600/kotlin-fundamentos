package clase_16

class Emeil (
    val remitente: String,
    val mensaje: String
) {
    var asunto: String = ""
        set(value) {
            field = if (value.trim().isNotEmpty()) value.trim() else "Sin asunto"
        }
    val esImportante: Boolean
        get() = asunto.contains("urgente", ignoreCase = true)
}

fun main() {
    val email1 = Emeil (
        remitente = "ivan@gmail.com",
        mensaje = "Este es un mensaje de correo."
    )

    email1.asunto = "     "
    println("El asunto es ${ email1.asunto }")

    email1.asunto = "URGENTE - Reunion jueves"
    println("El correo es importante? ${ email1.esImportante }")
}