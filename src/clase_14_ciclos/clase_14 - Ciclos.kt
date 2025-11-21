package clase_14_ciclos

fun main() {
    //WHILE
    var emailsPendientes = 3
    while (emailsPendientes > 0) {
        println("Procesando emails... quedan: $emailsPendientes.")
        emailsPendientes--
    }
    //DO WHILE
    var intentos = 0
    do {
        intentos++
        println("Intento de envío de correo n°$intentos.")
    } while (intentos < 2)
    //FOR
    for (i in 1 .. 3) {
        println("Valor de i: $i")
    }
    //FOR DECREMENTADO
    for (i in 8 downTo 6) {
        println("Valor de i: $i")
    }
    //FOR SALTEADO
    for (i in 1 .. 8 step 2) {
        println("Valor de i: $i")
    }
    //FOR CON ARRAYS
    val lista = listOf<String>("Megadeth", "Metallica", "Pantera")
    for (banda in lista) {
        println("Banda actual: $banda")
    }
    //==================================
    //EJERCICIO=========================
    val listaEmails = mutableListOf<String>()
    
    for (i in 1 .. 3) {
        print("Ingrese el email n°$i: ")
        listaEmails.add(readlnOrNull() ?: "ivan@mail.com")
    }
    println(listaEmails)
    var i = 0
    var contienenArroba = 0
    while (i < listaEmails.size) {
        if (listaEmails[i].contains("@")) {
            contienenArroba ++
        }
        i ++
    }
    println("Contienen @ $contienenArroba emails")
}


