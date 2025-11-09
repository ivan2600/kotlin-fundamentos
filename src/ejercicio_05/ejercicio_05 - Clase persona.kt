package ejercicio_05

class Persona (
    val nombre: String,
    var edad: Int,
    var nacionalidad: String
) {
    fun presentarse() {
        println("Hola, mi nombre es $nombre, tengo $edad años y soy $nacionalidad.")
    }
    fun cumplirAnios() {
        edad ++
        println("Feliz cumpleaños numero $edad.")
    }
    fun cambiarNacionalidad() {
        nacionalidad = "venezolano"
    }
}

fun main() {
    val persona1 = Persona(
        nombre = "Ivan",
        edad = 34,
        nacionalidad = "argentino"
    )

    persona1.presentarse()
    persona1.cumplirAnios()
    persona1.cambiarNacionalidad()
    persona1.presentarse()
}