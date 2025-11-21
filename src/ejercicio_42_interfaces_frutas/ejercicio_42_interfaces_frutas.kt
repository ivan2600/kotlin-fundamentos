package ejercicio_42_interfaces_frutas

interface FrutaRepository {
    fun save(nombre: String)
    fun findAll(): List<String>
    fun count(): Int
}

class InMemoryFrutaRepository: FrutaRepository {

    private val frutas = mutableListOf<String>()

    override fun save(nombre: String) {
        frutas.add(nombre)
    }

    override fun findAll(): List<String> {
        return frutas
    }

    override fun count(): Int {
        return frutas.size
    }
}

fun main() {
    val repo: FrutaRepository = InMemoryFrutaRepository()

    repo.save("Manzana")
    repo.save("Naranja")
    repo.save("Durazno")

    println("Cantidad de frutas: ${repo.count()}")
    println("Lista: ${repo.findAll()}")
}