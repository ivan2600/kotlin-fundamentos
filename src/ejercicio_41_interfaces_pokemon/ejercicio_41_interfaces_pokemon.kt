package ejercicio_41_interfaces_pokemon

interface PokemonRepository{
    fun save(nombre: String)
    fun findAll(): List<String>
}

class InMemoryPokemonRepository: PokemonRepository {

    private val nombres = mutableListOf<String>()

    override fun save(nombre: String) {
        nombres.add(nombre)
    }

    override fun findAll(): List<String> {
        return nombres
    }
}

fun main() {
    val repo: PokemonRepository = InMemoryPokemonRepository()

    repo.save("Pidgeotto")
    repo.save("Arbok")
    repo.save("Jigglypuff")

    println("Lista: ${repo.findAll()}")
}