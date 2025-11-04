package clase_11

fun main() {
    print("Ingresa tu dirección de email: ")
    val email = readlnOrNull() ?: "-"

    val rangoDeUsuario = when {
        email.contains("admin") -> "administrador."
        email.contains("support") -> "soporte."
        else -> "usuario."
    }
    println("El rango de usuario es $rangoDeUsuario")

    val proveedor = when {
        email.contains("gmail") -> "Google"
        email.contains("yahoo") -> "Yahoo"
        email.contains("outlook") -> "Microsoft"
        else -> "otro"
    }
    println("Tu proveedor de mensajería es $proveedor")

    print("Ingresa tu password: ")
    val password = readlnOrNull() ?: ""
    val seguridadDePassword = when {
        password.length >= 8 -> "alto"
        password.length >= 6 -> "medio"
        password.isEmpty() -> "nulo"
        else -> "bajo"
    }
    println("Tu nivel de seguridad de password es $seguridadDePassword")

}