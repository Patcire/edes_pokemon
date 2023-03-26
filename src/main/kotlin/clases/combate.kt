package clases
//importamos todas las clases para poder usar las funciones que hemos creado en ellas
import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo
import proyecto_final.clases.menu_ataque


//creamos la interface de combate y usamos las funciones necesarias antes descritas
interface Combate {
    fun atacar(pokemonAtacado: Pokemon, opcion_Ataque: Int)
    fun recibirAtaque(danio: Int, tipo: Tipo): Boolean


    //comienza el combate
    fun combatir(listaJugadores: MutableMap<String, Pokemon>) {
        while (true) {
            for ((jugador, pokemon) in listaJugadores) {
                println("Es el turno del jugador $jugador.\n")
                println("$jugador, selecciona un ataque:\n")
                var opcion_Ataque = menu_ataque()

            }
        }
    }

}

