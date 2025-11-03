import java.io.File
import java.time.LocalDate

// -------------------- CLASES --------------------

data class CartaPokemon(val numero: Int, val nombre: String)
data class RegistroSobres(var fecha: LocalDate, var abiertos: Int)

// -------------------- BASE DE DATOS DE CARTAS --------------------

val cartasDisponibles = listOf(
    CartaPokemon(0, "Pokebola"),
    CartaPokemon(1, "Bulbasaur"),
    CartaPokemon(2, "Ivysaur"),
    CartaPokemon(3, "Venusaur"),
    CartaPokemon(4, "Charmander"),
    CartaPokemon(5, "Charmeleon"),
    CartaPokemon(6, "Charizard"),
    CartaPokemon(7, "Squirtle"),
    CartaPokemon(8, "Wartortle"),
    CartaPokemon(9, "Blastoise"),
    CartaPokemon(10, "Caterpie"),
    CartaPokemon(11, "Metapod"),
    CartaPokemon(12, "Butterfree"),
    CartaPokemon(13, "Weedle"),
    CartaPokemon(14, "Kakuna"),
    CartaPokemon(15, "Beedrill"),
    CartaPokemon(16, "Pidgey"),
    CartaPokemon(17, "Pidgeotto"),
    CartaPokemon(18, "Pidgeot"),
    CartaPokemon(19, "Rattata"),
    CartaPokemon(20, "Raticate"),
    CartaPokemon(21, "Spearow"),
    CartaPokemon(22, "Fearow"),
    CartaPokemon(23, "Ekans"),
    CartaPokemon(24, "Arbok"),
    CartaPokemon(25, "Pikachu"),
    CartaPokemon(26, "Raichu"),
    CartaPokemon(27, "Sandshrew"),
    CartaPokemon(28, "Sandslash"),
    CartaPokemon(29, "Nidoran♀"),
    CartaPokemon(30, "Nidorina"),
    CartaPokemon(31, "Nidoqueen"),
    CartaPokemon(32, "Nidoran♂"),
    CartaPokemon(33, "Nidorino"),
    CartaPokemon(34, "Nidoking"),
    CartaPokemon(35, "Clefairy"),
    CartaPokemon(36, "Clefable"),
    CartaPokemon(37, "Vulpix"),
    CartaPokemon(38, "Ninetales"),
    CartaPokemon(39, "Jigglypuff"),
    CartaPokemon(40, "Wigglytuff"),
    CartaPokemon(41, "Zubat"),
    CartaPokemon(42, "Golbat"),
    CartaPokemon(43, "Oddish"),
    CartaPokemon(44, "Gloom"),
    CartaPokemon(45, "Vileplume"),
    CartaPokemon(46, "Paras"),
    CartaPokemon(47, "Parasect"),
    CartaPokemon(48, "Venonat"),
    CartaPokemon(49, "Venomoth"),
    CartaPokemon(50, "Diglett"),
    CartaPokemon(51, "Dugtrio"),
    CartaPokemon(52, "Meowth"),
    CartaPokemon(53, "Persian"),
    CartaPokemon(54, "Psyduck"),
    CartaPokemon(55, "Golduck"),
    CartaPokemon(56, "Mankey"),
    CartaPokemon(57, "Primeape"),
    CartaPokemon(58, "Growlithe"),
    CartaPokemon(59, "Arcanine"),
    CartaPokemon(60, "Poliwag"),
    CartaPokemon(61, "Poliwhirl"),
    CartaPokemon(62, "Poliwrath"),
    CartaPokemon(63, "Abra"),
    CartaPokemon(64, "Kadabra"),
    CartaPokemon(65, "Alakazam"),
    CartaPokemon(66, "Machop"),
    CartaPokemon(67, "Machoke"),
    CartaPokemon(68, "Machamp"),
    CartaPokemon(69, "Bellsprout"),
    CartaPokemon(70, "Weepinbell"),
    CartaPokemon(71, "Victreebel"),
    CartaPokemon(72, "Tentacool"),
    CartaPokemon(73, "Tentacruel"),
    CartaPokemon(74, "Geodude"),
    CartaPokemon(75, "Graveler"),
    CartaPokemon(76, "Golem"),
    CartaPokemon(77, "Ponyta"),
    CartaPokemon(78, "Rapidash"),
    CartaPokemon(79, "Slowpoke"),
    CartaPokemon(80, "Slowbro"),
    CartaPokemon(81, "Magnemite"),
    CartaPokemon(82, "Magneton"),
    CartaPokemon(83, "Farfetch’d"),
    CartaPokemon(84, "Doduo"),
    CartaPokemon(85, "Dodrio"),
    CartaPokemon(86, "Seel"),
    CartaPokemon(87, "Dewgong"),
    CartaPokemon(88, "Grimer"),
    CartaPokemon(89, "Muk"),
    CartaPokemon(90, "Shellder"),
    CartaPokemon(91, "Cloyster"),
    CartaPokemon(92, "Gastly"),
    CartaPokemon(93, "Haunter"),
    CartaPokemon(94, "Gengar"),
    CartaPokemon(95, "Onix"),
    CartaPokemon(96, "Drowzee"),
    CartaPokemon(97, "Hypno"),
    CartaPokemon(98, "Krabby"),
    CartaPokemon(99, "Kingler"),
    CartaPokemon(100, "Voltorb"),
    CartaPokemon(101, "Electrode"),
    CartaPokemon(102, "Exeggcute"),
    CartaPokemon(103, "Exeggutor"),
    CartaPokemon(104, "Cubone"),
    CartaPokemon(105, "Marowak"),
    CartaPokemon(106, "Hitmonlee"),
    CartaPokemon(107, "Hitmonchan"),
    CartaPokemon(108, "Lickitung"),
    CartaPokemon(109, "Koffing"),
    CartaPokemon(110, "Weezing"),
    CartaPokemon(111, "Rhyhorn"),
    CartaPokemon(112, "Rhydon"),
    CartaPokemon(113, "Chansey"),
    CartaPokemon(114, "Tangela"),
    CartaPokemon(115, "Kangaskhan"),
    CartaPokemon(116, "Horsea"),
    CartaPokemon(117, "Seadra"),
    CartaPokemon(118, "Goldeen"),
    CartaPokemon(119, "Seaking"),
    CartaPokemon(120, "Staryu"),
    CartaPokemon(121, "Starmie"),
    CartaPokemon(122, "Mr. Mime"),
    CartaPokemon(123, "Scyther"),
    CartaPokemon(124, "Jynx"),
    CartaPokemon(125, "Electabuzz"),
    CartaPokemon(126, "Magmar"),
    CartaPokemon(127, "Pinsir"),
    CartaPokemon(128, "Tauros"),
    CartaPokemon(129, "Magikarp"),
    CartaPokemon(130, "Gyarados"),
    CartaPokemon(131, "Lapras"),
    CartaPokemon(132, "Ditto"),
    CartaPokemon(133, "Eevee"),
    CartaPokemon(134, "Vaporeon"),
    CartaPokemon(135, "Jolteon"),
    CartaPokemon(136, "Flareon"),
    CartaPokemon(137, "Porygon"),
    CartaPokemon(138, "Omanyte"),
    CartaPokemon(139, "Omastar"),
    CartaPokemon(140, "Kabuto"),
    CartaPokemon(141, "Kabutops"),
    CartaPokemon(142, "Aerodactyl"),
    CartaPokemon(143, "Snorlax"),
    CartaPokemon(144, "Articuno"),
    CartaPokemon(145, "Zapdos"),
    CartaPokemon(146, "Moltres"),
    CartaPokemon(147, "Dratini"),
    CartaPokemon(148, "Dragonair"),
    CartaPokemon(149, "Dragonite"),
    CartaPokemon(150, "Mewtwo"),
    CartaPokemon(151, "Mew")
)

// -------------------- GUARDADO Y CARGA --------------------

fun guardarAlbum(album: List<CartaPokemon>) {
    val archivo = File("album.txt")
    archivo.printWriter().use { out ->
        for (carta in album) out.println("${carta.numero},${carta.nombre}")
    }
}

fun cargarAlbum(): MutableList<CartaPokemon> {
    val archivo = File("album.txt")
    val albumCargado = mutableListOf<CartaPokemon>()
    if (archivo.exists()) {
        archivo.forEachLine { linea ->
            val (numero, nombre) = linea.split(",")
            albumCargado.add(CartaPokemon(numero.toInt(), nombre))
        }
        println("📂 Álbum cargado con ${albumCargado.size} cartas.")
    } else println("🆕 No hay álbum guardado, comenzamos desde cero.")
    return albumCargado
}

fun cargarRegistro(): RegistroSobres {
    val archivo = File("registro.txt")
    return if (archivo.exists()) {
        val (fecha, abiertos) = archivo.readText().split(",")
        RegistroSobres(LocalDate.parse(fecha), abiertos.toInt())
    } else RegistroSobres(LocalDate.now(), 0)
}

fun guardarRegistro(registro: RegistroSobres) {
    val archivo = File("registro.txt")
    archivo.writeText("${registro.fecha},${registro.abiertos}")
}

// -------------------- FUNCIONES PRINCIPALES --------------------

fun opciones() {
    println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*")
    println("1. Abrir sobre de cartas")
    println("2. Ver cartas coleccionadas")
    println("3. Cuántas cartas tengo?")
    println("4. Guardar progreso y salir")
    println("5. Ver cartas que faltan")
    println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*")
}

fun abrirSobre(album: MutableList<CartaPokemon>, registro: RegistroSobres) {
    val hoy = LocalDate.now()

    if (registro.fecha != hoy) {
        registro.fecha = hoy
        registro.abiertos = 0
    }

    if (registro.abiertos >= 2) {
        println("⛔ Ya abriste tus sobres diarios. Volvé mañana!")
        return
    }

    registro.abiertos++
    guardarRegistro(registro)

    val sobre = mutableListOf<CartaPokemon>()
    repeat(5) { sobre.add(cartasDisponibles.random()) }

    println("Estas son tus nuevas cartas...")
    for (carta in sobre) println("#${carta.numero} - ${carta.nombre}")

    for (carta in sobre) if (!album.contains(carta)) album.add(carta)
    sobre.clear()
}

fun verCartasColeccionadas(album: MutableList<CartaPokemon>) {
    album.sortBy { it.numero }
    println("Estas son las cartas de tu colección:")
    for (carta in album) println("#${carta.numero} - ${carta.nombre}")
}

fun cuantasTengo(album: MutableList<CartaPokemon>) {
    println("Tienes ${album.size}/152 cartas.")
}

fun verCartasFaltantes(album: MutableList<CartaPokemon>) {
    val faltantes = cartasDisponibles.filterNot { album.contains(it) }
    if (faltantes.isEmpty()) {
        println("🎉 ¡Felicitaciones! Completaste tu colección!")
    } else {
        println("Te faltan ${faltantes.size} cartas:")
        faltantes.sortedBy { it.numero }.forEach {
            println("#${it.numero} - ${it.nombre}")
        }
    }
}

// -------------------- MAIN --------------------

fun main() {
    println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*")
    println("*.*.*.*.* ALBUM DE CARTAS DE POKEMON *.*.*.*.*")

    val album = cargarAlbum()
    val registro = cargarRegistro()

    while (true) {
        opciones()
        when (readlnOrNull()?.toIntOrNull()) {
            1 -> abrirSobre(album, registro)
            2 -> verCartasColeccionadas(album)
            3 -> cuantasTengo(album)
            4 -> {
                guardarAlbum(album)
                guardarRegistro(registro)
                println("💾 Progreso guardado. ¡Hasta la próxima, entrenador!")
                break
            }
            5 -> verCartasFaltantes(album)
        }
    }
}
