class Contacto (
    val nombre: String,
    val email: String
) {
    fun mostrarContacto() {
        println("Nombre: $nombre | Email: $email")
    }
}

fun main() {
    val contacto1 = Contacto (
        nombre = "Ivan",
        email = "ivan.adamo.8@gmail.com"
    )

    contacto1.mostrarContacto()
}