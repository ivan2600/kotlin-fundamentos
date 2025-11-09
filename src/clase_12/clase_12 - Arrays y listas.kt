package clase_12

fun main() {

    val emails = arrayOf("ivan@quicklysabor.com", "osvaldo@quicklysabor.com", "ivana@quicklysabor.com")
    val cantidad = arrayOf(1, 15, 50, 100)

    println("El primer correo es: ${ emails[0] }")
    //Se pueden reemplazar valores facilmente (las dos formas son equivalentes)
    //emails[0] = "ivan.adamo.8@gmail.com"
    emails.set(0, "ivan.adamo.8@gmail.com")
    emails[2] = "dio.bruno.8@gmail.com"

    println(emails.get(1))
    println(emails[2])
    //Como imprimir un array COMPLETO?
    println("La ejercicio_24.lista de correos es: ${ emails.joinToString() }.")
    //Imprimir el tamaño de un array
    println("El tamaño del array es de ${ emails.size } pocisiones.")

    //Para crear un array modificable...
    val nuevaListaDeEmails = mutableListOf<String>()
    println("Nueva ejercicio_24.lista: ${ nuevaListaDeEmails.joinToString() }, tamaño: ${ nuevaListaDeEmails.size }")
    nuevaListaDeEmails.addAll(arrayOf("ivan@quicklysabor.com", "osvaldo@quicklysabor.com", "ivana@quicklysabor.com"))
    println("Nueva ejercicio_24.lista: ${ nuevaListaDeEmails.joinToString() }, tamaño: ${ nuevaListaDeEmails.size }")
    nuevaListaDeEmails.remove("ivana@quicklysabor.com")
    println("Nueva ejercicio_24.lista: ${ nuevaListaDeEmails.joinToString() }, tamaño: ${ nuevaListaDeEmails.size }")
    nuevaListaDeEmails.add(1, "dio.bruno.8@gmail.com")
    println("Nueva ejercicio_24.lista: ${ nuevaListaDeEmails.joinToString() }, tamaño: ${ nuevaListaDeEmails.size }")
    println(nuevaListaDeEmails)

    val lista = listOf<String>("Megadeth", "Metallica", "Pantera")
    println(lista)//las listas se imprimen bien - pero no se puede modificar el contenido.
    println(emails.joinToString())//los arrays necesitan este metodo de mierda para imprimirse
    println("=========================================================================")
    //EJERCICIO

    val listaDeAsuntos = mutableListOf<String>()
    listaDeAsuntos.addAll(arrayOf("Saludos", "Urgente", "Gratis"))
    listaDeAsuntos[1] = "Tu vieja"
    listaDeAsuntos.remove("Saludos")
    println("Lista de asuntos $listaDeAsuntos, tamaño: ${ listaDeAsuntos.size }")

}