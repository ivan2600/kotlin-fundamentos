package ejercicio_09_data_class_contacto

data class Contacto3 (
    val nombre: String,
    val email: String
)

fun main() {
    val contacto1 = Contacto3(nombre = "Ivan", email = "ivan@gmail.com")
    val contacto2 = Contacto3(nombre = "Dio", email = "dio@gmail.com")

    println("Comparación: ${ contacto1 == contacto2 }")

    val copiaContacto2 = contacto2.copy(nombre = "Dio Bruno")
    println(contacto2)
    println(copiaContacto2)
}