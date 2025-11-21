package clase_25_encapsulamiento

open class Email(
    val subject: String,
    private val password: String,
    private var isEncrypted: Boolean = false
) {
    fun send(encrypt: Boolean): String {
        if (encrypt) {
            encrypt()
        }
        return "Email enviado"
    }
    private fun encrypt() {
        isEncrypted = true
        println("El correo esta encriptado")
    }

}

class SecureEmail(subject: String, password: String): Email(subject,password,true) {
    fun showEncryptionAlgorithm(): String {
        return "SHA1"
    }
}

fun main() {
    val email = Email("asunto", "1234")
    val secureEmail = SecureEmail("asunto 2", "5678")

    secureEmail.showEncryptionAlgorithm()

}