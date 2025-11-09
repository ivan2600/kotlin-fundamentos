package ejercicio_06

class Contactos {
    var email: String = ""
        set(value) {
            field = if (value.contains("@")) value else ""
        }
    val esValido: Boolean
        get() = email.contains(".com", ignoreCase = true)
}

fun main() {

    val contacto1 = Contactos()
    print("Ingrese el email de contacto1: ")
    contacto1.email = readln()
    if (contacto1.email.isNotEmpty()) {
        println("El correo es: ${ contacto1.email }")
    } else {
        println("Sin dirección de correo electrónico.")
    }
    if (contacto1.esValido) {
        println("El correo es valido")
    } else {
        println("El correo no es valido")
    }
}