package clase_21_funciones_de_alto_orden

data class Email (
    val subject: String,
    val sender: String,
    val isRead: Boolean = false
)

fun main() {
    val emails = listOf<Email>(
        Email("Reunion", "pepito-gmail.com", false),
        Email("Reporte", "admin@gmail.com", false),
        Email("Urgente", "cliente@test.com", false)
    )

    val formatearEmail:(Email) -> String = { email ->
        "${email.subject} de ${email.sender}"
    }

    val emailsFormateados = emails.map(formatearEmail)

    emailsFormateados.forEachIndexed { index, email ->
        println("Correo n°$index: $email")
    }

    val email1 = emails.get(0)
    val email2 = emails.get(1)
    enviarEmail(
        email1,
        onSuccess = { e, mensaje ->
            println("${e.subject} $mensaje")
        },
        onError = { mensaje, error ->
            println("Error: $mensaje Código: Error$error")
        }
    )

}

fun enviarEmail(
    email: Email,
    onSuccess:(Email, String) -> Unit,
    onError:(String, Int) -> Unit
) {
    if(email.sender.contains("@")){
        val mensaje = "Enviado a ${email.sender}"
        onSuccess(email, mensaje)
    } else {
        onError("clase_15.Email invalido: ${email.sender}", 400)
    }
}