package ejercicio_07

class Persona2 {

    var nombre: String = "Ivi"
        set(value) {
            if (value.isBlank()) {
                println("❌ El nombre no puede estar vacío.")
            } else {
                field = value
                println("✅ Nombre actualizado a: $value.")
            }
        }

    var edad: Int = 0
        set(value) {
            if (value < 0) {
                println("❌ La edad no puede ser negativa.")
            } else {
                field = value
                println("✅ Edad actualizada a: $value años.")
            }
        }

    val descripcion: String
        get() = "Soy $nombre y tengo $edad años."
}

fun main() {
    val persona = Persona2()

    persona.nombre = ""      // ❌ inválido
    persona.nombre = "Dio"   // ✅ válido

    persona.edad = -5        // ❌ inválido
    persona.edad = 10        // ✅ válido

    println(persona.descripcion)
}
