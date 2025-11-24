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
    return carrito.productos.sumOf { it.precio }
}

fun aplicarDescuento(carrito: CarritoDeCompra): Double {
    val subtotal = calcularSubtotal(carrito)

    val descuento = when {
        subtotal >= 1000 -> 0.15
        subtotal >= 500 -> 0.10
        subtotal >= 200 -> 0.05
        else -> 0.0
    }
    return subtotal * (1 - descuento)
}

fun obtenerPorcentajeDescuento(carrito: CarritoDeCompra): Int {
    val subtotal = calcularSubtotal(carrito)

    return when {
        subtotal >= 1000 -> 15
        subtotal >= 500 -> 10
        subtotal >= 200 -> 5
        else -> 0
    }
}

fun productosPorCategoria(carrito: CarritoDeCompra, categoria: String): List<Producto> {
    return carrito.productos.filter { it.categoria == categoria }
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
    println("Descuento aplicado: ${obtenerPorcentajeDescuento(carrito1)}%")
    println("TOTAL A PAGAR: $${aplicarDescuento(carrito1)}")
    println()
    println("Productos por categoría:")
    println("Electronica: ${productosPorCategoria(carrito1, "Electronica").size} producto(s)")
    println("Ropa: ${productosPorCategoria(carrito1, "Ropa").size} producto(s)")
    println("Comida: ${productosPorCategoria(carrito1, "Comida").size} producto(s)")
}