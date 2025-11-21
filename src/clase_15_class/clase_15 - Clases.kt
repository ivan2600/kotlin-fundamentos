package clase_15_class

class Email (
    val asunto: String,
    val remitente: String,
    val mensaje: String
){
    var leido: Boolean = false
    fun marcarComoLeido() {
        leido = true
    }
    fun marcarComoNoLeido() {
        leido = false
    }
    fun mostrarLaInfo() {
        println("De: $remitente | Asunto: $asunto | Leido: $leido")
    }
}

class BandejaDeEmails {
    val emails = mutableListOf<Email>()
    fun agregarUnEmail(email:Email) {
        emails.add(email)
    }
    fun contarNoLeidos(): Int {
        var contador = 0
        for (email in emails) {
            if (!email.leido)
                contador ++
        }
        return contador
    }
}

fun main() {
    val email1 = Email (
        asunto = "Vacaciones",
        remitente = "Osvaldo",
        mensaje = "Vamos a Mundo Marino"
    )
    val email2 = Email (
        asunto = "Navidad",
        remitente = "Papá Noel",
        mensaje = "Feliz navidad! Jo Jo Jo"
    )
    val email3 = Email (
        asunto = "Nuevo álbum",
        remitente = "Megadeth",
        mensaje = "Saldra en enero de 2026"
    )

    email1.marcarComoLeido()

    val bandejaDeEmails = BandejaDeEmails()

    bandejaDeEmails.agregarUnEmail(email1)
    bandejaDeEmails.agregarUnEmail(email2)
    bandejaDeEmails.agregarUnEmail(email3)
    println("Faltan por leer: ${bandejaDeEmails.contarNoLeidos()}")
}