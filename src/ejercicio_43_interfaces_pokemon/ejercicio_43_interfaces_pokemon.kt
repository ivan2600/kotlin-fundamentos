package ejercicio_43_interfaces_pokemon

data class Pokemon(
    val id: Int,
    val nombre: String
)

interface PokemonRepository {
    fun save(pokemon: Pokemon)
    fun findAll(): List<Pokemon>
    fun findById(id: Int): Pokemon?
    fun deleteById(id: Int)
    val count: Int
}

class InMemoryPokemonRepository: PokemonRepository {
    private val pokemons = mutableListOf<Pokemon>()

    override fun save(pokemon: Pokemon) {
        pokemons.add(pokemon)
    }

    override fun findAll(): List<Pokemon> {
        return pokemons
    }

    override fun findById(id: Int): Pokemon? {
        return pokemons.find{ pokemon -> pokemon.id == id }
    }

    override fun deleteById(id: Int) {
        pokemons.removeIf { pokemon -> pokemon.id == id }
    }

    override val count: Int
        get() = pokemons.size
}

fun main() {
    val repo: PokemonRepository = InMemoryPokemonRepository()

    repo.save(Pokemon(4, "Charmander"))
    repo.save(Pokemon(5, "Charmeleon"))
    repo.save(Pokemon(6, "Charizard"))

    println("Cantidad: ${repo.count}")
    println("Buscado: ${repo.findById(5)}")
    repo.deleteById(6)
    println("Lista: ${repo.findAll()}")
}
