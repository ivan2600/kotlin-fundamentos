package clase_26_interfaces

import java.util.UUID

data class Email(
    val id: UUID,
    val asunto: String,
    val mensaje: String
    )

interface EmailRepository{
    val sizeEmails: Int
    fun save(email: Email)
    fun findById(id: UUID): Email?
    fun findAll(): List<Email>
    fun deleteEmailById(id: UUID)
}

class InMemoryEmailRepository : EmailRepository {

    val repositoryName: String = "InMemoryEmailRepository"

    private val emails = mutableListOf<Email>()
    override val sizeEmails: Int
        get() = emails.size

    override fun save(email: Email) {
        emails.add(email)
    }

    override fun findById(id: UUID): Email? {
        return emails.find{ email -> email.id == id }
    }

    override fun findAll(): List<Email> {
        return emails
    }

    override fun deleteEmailById(id: UUID) {
        emails.removeIf { email -> email.id == id }
    }
}

fun main() {

    val emailsRepository: EmailRepository = InMemoryEmailRepository()
    println("Emails en repositorio: ${emailsRepository.sizeEmails}")
    emailsRepository.save(
        Email(
            id = UUID.randomUUID(),
            asunto = "email 1",
            mensaje = "Contenido"
        )
    )

    println(emailsRepository.sizeEmails)
    println("Emails en repositorio: ${emailsRepository.sizeEmails}")
    println("Lista emails: ${emailsRepository.findAll()}")

    emailsRepository.deleteEmailById(emailsRepository.findAll().first().id)
    println("Emails en repositorio: ${emailsRepository.sizeEmails}")

}