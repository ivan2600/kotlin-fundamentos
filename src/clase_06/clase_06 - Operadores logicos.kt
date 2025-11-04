package clase_06

fun main() {

    val emailsRecibidos = 15
    val emailsEnviados = 10
    val limiteEmails = 20

    val tieneEmails = emailsRecibidos > 0
    println("Tiene emails? - $tieneEmails")

    val excedeEnviados = emailsEnviados >= limiteEmails
    println("Excede el limite de enviados? - $excedeEnviados")

    val sonIguales = emailsRecibidos == emailsEnviados
    println("Son iguales? - $sonIguales")

    val sonDiferentes = emailsRecibidos != emailsEnviados
    println("Son diferentes? - $sonDiferentes")

    val email = "user@example.com"
    val password = "123456"
    val asunto = "No es spam"

    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".")
    val emailValido = tieneArroba && tienePunto

    println("Es un email valido? - $emailValido")

    val passwordCorto = password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto || passwordLargo

    println("Es problematico? - $passwordProblematico")

    val emailInvalido = !emailValido

    println("Es un email invalido? - $emailInvalido")

    //EJERCICIO
    val tieneTest = email.contains("test")
    println("Coniene test? - $tieneTest")

    val emailValidoFinal = emailValido && !tieneTest
    println("Valido final? - $emailValidoFinal")

    val esSpam = asunto.contains("URGENTE") || asunto.contains("GRATIS")
    println("Es spam? - $esSpam")

}