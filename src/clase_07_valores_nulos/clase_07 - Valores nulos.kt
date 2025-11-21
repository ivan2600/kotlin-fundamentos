package clase_07_valores_nulos

fun main() {

    var emailObligatorio : String = "user@email.com"
    var emailOpcional : String? = null

    emailOpcional = "user@opcional.com"

    //println(emailOpcional!!) //Los dos !! sirven para asegurar que el valor no es nulo. Es una mala práctica.

    val longitudEmail = emailOpcional?.length ?: "Correo no existente."//En caso de que el valor de emailOpcional sea null, hay que poner "?"
    // "?:" el operador elvis
    println("Longitud del correo: $longitudEmail")

    //EJERCICIO

    val email = "user@energia.com"
    var nombre : String? = null
    val nombreUsuario = nombre ?: "Anonimo"
    val longitudNombre = nombre?.length ?: 0

    println("Nombre de usuario: $nombreUsuario")
    println("Longitud del nombre: $longitudNombre")


}