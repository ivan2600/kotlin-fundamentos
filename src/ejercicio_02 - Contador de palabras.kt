fun main() {

    val listaDeValores = mutableListOf<Int>()
    var contadorDeFrases = 0

    while (true) {
        print("Escriba una frase: ")
        val frase = readlnOrNull() ?: ""
        val partir = frase.split(" ").filter { it.isNotBlank() }
        val contar = partir.size

        if (frase.equals("fin", ignoreCase = true)) {
            break
        }
        if (contar > 0) {
            listaDeValores.add(contar)
            contadorDeFrases++
        }
    }
    val promedioDePalabras = listaDeValores.average()

    println("Cantidad de frases: $contadorDeFrases.")
    println("El promedio de palabras es: $promedioDePalabras.")
    println("Lista de palabras por frase: $listaDeValores")
}