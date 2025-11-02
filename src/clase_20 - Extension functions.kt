fun String.isValidEmail(): Boolean {
    return this.contains("@") && this.contains(".")
}

fun String.addSignatureToName(companyName: String): String {
    return "${ this }\n\n--${ companyName.uppercase() }"
}

val String.emailDomain: String
    get() = this.substringAfter("@")

data class Email2 (
    val subject: String,
    val sender: String,
    val body: String,
    var isRead: Boolean
)

fun Email2.markAsRead() {
    this.isRead = true
    println("Email ${this.subject} marcado como leido.")
}

fun main() {

    val email = "ivan@gmail.com"
    email.isValidEmail()

    println("El email es: $email")
    println("Es un email valido? ${ email.isValidEmail() }")

    val nombreRemitente = "Iván"
    println(nombreRemitente.addSignatureToName("Empresa 1"))
    println("El dominio del correo es: ${email.emailDomain}")

    val correoDataClass = Email2("Reunión", "tuvieja@gmail.com", "Todos los que asisten son putos", false)
    println(correoDataClass)
    correoDataClass.markAsRead()
    println(correoDataClass)

}
