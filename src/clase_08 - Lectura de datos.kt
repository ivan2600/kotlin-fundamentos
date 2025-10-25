fun main() {

    println("*****Sistema de Email*****")
    print("Ingresa tu email: ")
    val email = readLine() ?: "Sin email"

    print("Ingresa el destinatario: ")
    val destinatario = readLine() ?: "Sin email"

    print("Ingresa el asunto: ")
    val asunto = readLine() ?: "Sin asunto"

    print("Ingresa el mensaje: ")
    val mensajeSinLimpiar = readLine() ?: "Sin mensaje"
    val mensajeLimpio = mensajeSinLimpiar?.trim()

    println("========================")
    println("VISTA PREVIA DEL CORREO")
    println("========================")

    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Mensaje: $mensajeLimpio")

}