import proyecto_final.clases.*
import funciones.*

fun main(args: Array<String>) {

    val pokemon_jugador1=Pokemon()
    val pokemon_jugador2=Pokemon()
    val mapa_jugador_pokemon = mutableMapOf<String, Pokemon>("Jugadorx 1" to pokemon_jugador1, "Jugadorx 2" to pokemon_jugador2)

    println(
        "¡BIENVENIDE AL COMBATE, ENTRENADORX!\n" +
         "-----------------------------------------")

    crear_pokemons(mapa_jugador_pokemon)
    combatir(pokemon_jugador1, pokemon_jugador2)

}









