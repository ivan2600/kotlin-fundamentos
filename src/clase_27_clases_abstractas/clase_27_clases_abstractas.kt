package clase_27_clases_abstractas

import clase_26_interfaces.Email
import java.util.UUID

abstract class BaseEmailRepository{
    abstract val sizeEmails: Int
    abstract fun save(email: Email)
    abstract fun findById(id: UUID): Email?
    abstract fun findAll(): List<Email>
    abstract fun deleteEmailById(id: UUID)
}

class InMemoryAbstractEmailRepository: BaseEmailRepository() {
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

    val emailsRepository = InMemoryAbstractEmailRepository()

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