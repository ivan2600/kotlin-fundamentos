fun String.capitalizar(): String {
    return this.replaceFirstChar { it.uppercase() }
}

fun String.contarPalabras(): Int {
    return this.trim().split("\\s+".toRegex()).size
}

fun main() {
    val unStringCualquiera = "tu vieja en tanga"
    println(unStringCualquiera.capitalizar())
    println(unStringCualquiera.contarPalabras())

}