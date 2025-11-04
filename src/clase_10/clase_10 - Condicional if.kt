package clase_10

fun leerEmails(): String {
    println("Ingresa tu email: ")
    val email = readlnOrNull()?.trim() ?: "Sin correo"
    return email
}

fun leerPassword(): String {
    println("Ingresa tu password: ")
    val password = readlnOrNull()?.trim() ?: "Sin password"
    return password
}

//EJERCICIO
fun clasificarEmail(direccion: String): String {
    val rango = if (direccion.contains("admin")) {
        "Administrador"
    } else if (direccion.contains("support")) {
        "Soporte"
    } else {
        "Usuario"
    }

    return "El corresponde a un $rango"
}

fun main() {
    val email = leerEmails()
    if (email.contains("@")) {
        println("El email tiene un formato valido")
    } else {
        println("El email no tiene un formato valido")
    }

    val password = leerPassword()
    val nivelDeSeguridad = if (password.length >= 8) {
        "Alto"
    } else if (password.length >= 6) {
        "Medio"
    } else {
        "Bajo"
    }
    println("El nivel de seguridad del password es: $nivelDeSeguridad")

    println(clasificarEmail(direccion = email))
}