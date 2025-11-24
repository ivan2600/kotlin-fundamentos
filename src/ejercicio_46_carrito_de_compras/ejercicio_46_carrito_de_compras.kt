package ejercicio_46_carrito_de_compras

data class Producto (
    val nombre: String,
    val precio: Double,
    val categoria: String
)

data class CarritoDeCompra (
    val productos: MutableList<Producto>
)

fun agregarProducto(carrito: CarritoDeCompra, producto: Producto) {
    carrito.productos.add(producto)
}

fun calcularSubtotal(carrito: CarritoDeCompra): Double {
    var subtotal = 0.0
    for (producto in carrito.productos) {
        subtotal += producto.precio
    }
    return subtotal
}




fun main() {

    val producto1 = Producto("Laptop", 800.0, "Electronica")
    val producto2 = Producto("Camisa", 150.0, "Ropa")
    val producto3 = Producto("Pan", 50.0, "Comida")

    val carrito1 = CarritoDeCompra(mutableListOf())
    agregarProducto(carrito1, producto1)
    agregarProducto(carrito1, producto2)
    agregarProducto(carrito1, producto3)

    println("=== CARRITO DE COMPRAS ===")
    for (i in carrito1.productos) println(" - ${i.nombre} (${i.categoria}): $${i.precio}")
    println()
    println("Subtotal: $${calcularSubtotal(carrito1)}")


}