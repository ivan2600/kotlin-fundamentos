package clase_19_try_catch

class EmailInvalidException(message: String): Exception(message)

fun main() {
    val emails = listOf<String>("ivan@gmail.com", "dio@gmail.com", "natalia-gmail.com")
    var esExitoso = false

    try {
        emails[10]
        throw RuntimeException("Algo pasó con el procesamiento de correos.")
        esExitoso = true
    } catch (e:ArrayIndexOutOfBoundsException) {
        println("Indice de emails no existente.")
    } finally {
        println("Finalizó el procesamiento de emails. Fué exitoso? $esExitoso")
    }

    try {
        for (email in emails) {
            if (!email.contains("@"))
                throw EmailInvalidException("clase_15.Email invalido no tiene @.")
        }
    } catch (e: EmailInvalidException) {
        println("Mensaje de error: ${e.message}")
    }


}

