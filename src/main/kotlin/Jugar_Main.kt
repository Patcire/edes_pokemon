import proyecto_final.clases.*
import funciones.*

/**
 *  Funcion [main] que ejecuta el juego.  Crea dos instancias por defecto de la clase Pokemon, actualiza sus parámetros a los del pokemon escogido por
 *  el jugador mediante la función [crear_pokemons], les asigna sus jugadores correspondientes mediante un mapa y desarrolla el combate
 *  invocando la función [combatir].
 *
 *
 *
 *   @author: Sara Sánchez, Patricio Cifredo
 *   @since 27/03/2027
 *
 */
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









