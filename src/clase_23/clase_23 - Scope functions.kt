package clase_23

import java.util.UUID

data class Email(
    val id: String,
    var subject: String,
    var body: String,
    var isRead: Boolean
)

fun main() {

    println("1. LET")

    val emailId: String = UUID.randomUUID().toString()

    val email = emailId.let { id ->
        Email(
            id = id,
            subject = "Reunion",
            body = "Mensaje",
            isRead = false
        )
    }
    println("Transformamos $emailId a un $email")

    println("2. APPLY")

    val email2 = Email(
        id = UUID.randomUUID().toString(),
        subject = "Reunion",
        body = "Mensaje2",
        isRead = false
    ).apply {
        subject = "Fiesta Fin De Año"
    }

    println(email2)

    println("3. RUN")
    val email3 = Email(
        id = UUID.randomUUID().toString(),
        subject = "Oferta",
        body = "Mensaje3",
        isRead = false
    ).run {
        isRead = true
        subject = subject.uppercase()
        "Email procesado: $subject"
    }

    println(email3)

    println("4. WITH")
    val email4 = Email(
        id = UUID.randomUUID().toString(),
        subject = "Importante",
        body = "Mensaje4",
        isRead = false
    )
    val summary = with(email4){
        isRead = true
        "ID: ${id}, Asunto: $subject, Leido: $isRead"
    }

    println("El resumen de $email4 es $summary")

    println("5. ALSO")
    val email5 = Email(
        id = UUID.randomUUID().toString(),
        subject = "Asunto 5",
        body = "Mensaje 5",
        isRead = false
    ).also {
        println("Enviar correo $it...")
    }

}