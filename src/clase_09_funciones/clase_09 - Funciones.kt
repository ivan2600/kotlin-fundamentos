package clase_09_funciones

fun mensajeBienvenida() {
    println("=====SISTEMA DE EMAIL=====")
    println("Bienvenido al gestor de emails")
}

fun saludarUsuario(nombre : String = "usuario") {
    println("Hola $nombre, tienes nuevos mensajes sin leer.")
}

fun leerEmail() : String {
    println("Ingresa tu email: ")
    val email = readLine()?.trim() ?: "Sin correo"
    return email
}

fun leerAsunto() : String {
    println("Ingresar asunto: ")
    val asunto = readLine()?.trim() ?: "Sin asunto"
    return asunto
}

fun leerMensaje() : String {
    println("Ingresar mensaje: ")
    val mensaje = readLine()?.trim() ?: "Sin mensaje"
    return mensaje
}

fun crearMensajeEmail(destinatario : String, asunto : String, mensaje : String) {
    println("==========================")
    println("EMAIL CREADO")
    println("==========================")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Mensaje: $mensaje")
    println("==========================")
}

fun enviarEmail() {
   println("clase_15.Email enviado...")
}

//EJERCICIO
fun leerDatosCompletos(): String {
    println("Ingresa tu nombre: ")
    val nombre = readlnOrNull()?.trim() ?: "Anonimo"
    println("Ingresa tu email: ")
    val email = readlnOrNull()?.trim() ?: "Sin correo"
    return "Nombre: $nombre - clase_15.Email: $email"
}

fun main() {

    mensajeBienvenida()
    saludarUsuario(nombre = "Ivan")
    val email = leerEmail()
    val asunto = leerAsunto()
    val mensaje = leerMensaje()
    crearMensajeEmail(
        mensaje = mensaje,
        destinatario = email,
        asunto = asunto
    )
    enviarEmail()
    //===========================
    println(leerDatosCompletos())

}