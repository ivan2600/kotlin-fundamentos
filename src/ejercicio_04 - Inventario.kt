fun main() {

    val listaDeProductos = mutableListOf<String>()

    while (true) {
        print("Ingrese un producto: ")
        val producto = readlnOrNull()?.trim()

        if (producto.equals("fin", ignoreCase = true)) {
            break
        }
        if (producto.equals("eliminar", ignoreCase = true)) {
            print("Que producto desea eliminar?...")
            val eliminar = readlnOrNull()?.trim()
            if (listaDeProductos.contains(eliminar)){
                listaDeProductos.remove(eliminar)
                println("Producto '$eliminar' eliminado correctamente.")
            } else {
                println("Ese producto no fué ingresado")
            }
        }
        if (!producto.isNullOrBlank() && !producto.equals("eliminar", ignoreCase = true)) {
            listaDeProductos.add(producto)
        }
    }

    val cantidadDeProductos = listaDeProductos.size
    val estaVacia = if (listaDeProductos.isNotEmpty()) {
        "La lista no está vacia."
    } else {
        "La lista está vacía"
    }
    val listaEnLimpio = listaDeProductos.joinToString()

    println("Cantidad total de productos: $cantidadDeProductos.")
    println(estaVacia)
    println("Productos: $listaEnLimpio")
}