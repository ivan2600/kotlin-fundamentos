package ejercicio_18_guardado_y_carga_de_datos

import java.io.File

fun guardarDatos(nombre: String, edad: Int) {
    val archivo = File("datos.txt")
    archivo.writeText("$nombre,$edad")
    println("✅ Datos guardados en el archivo.")
}

fun cargarDatos() {
    val archivo = File("datos.txt")

    if (archivo.exists()) {
        val contenido = archivo.readText()
        val (nombre, edad) = contenido.split(",")
        println("📂 Datos cargados:")
        println("Nombre: $nombre")
        println("Edad: $edad")
    } else {
        println("⚠️ No hay archivo guardado todavía.")
    }
}

fun main() {
    println("¿Qué querés hacer?")
    println("1. Guardar datos")
    println("2. Cargar datos")

    when (readlnOrNull()) {
        "1" -> {
            print("Ingresá tu nombre: ")
            val nombre = readlnOrNull() ?: "Desconocido"

            print("Ingresá tu edad: ")
            val edad = readlnOrNull()?.toIntOrNull() ?: 0

            guardarDatos(nombre, edad)
        }

        "2" -> cargarDatos()

        else -> println("Opción no válida.")
    }
}
