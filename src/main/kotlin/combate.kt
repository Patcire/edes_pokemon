/*
import proyecto_final.clases.Ataque
import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo
interface combate {
    //creamos la interface de combate y usamos las funciones necesarias antes descritas

    fun atacar(pokemonAtacado: Pokemon, opcion_Ataque: Int)
    fun recibir_Ataque(danio: Int, tipo: Tipo): Boolean
    fun comprobar_efectividad(tipoAtaque: Tipo, tipoDefensa: Tipo): Double
    fun menu_ataque(opcion_Ataque: Int): Int

    fun combatir(lista_jugadores: MutableMap<String, Pokemon>) {
        while (true) {
            for ((jugadorx, pokemon_jugadorx) in lista_jugadores) {
                println("Es el turno del jugador $jugadorx.\n")
                //dice q no pasan parametros por danio ni tipo
                var opcion = menu_ataque()
                var danio = recibir_Ataque(danio = opcion, tipo = comprobar_efectividad(tipoAtaque = tipo.tipo_pokemon_contrincante, tipoDefensa = pokemon_jugadorx.tipo)).toDouble()
                //danio en funcion?
                //var efecto = comprobar_efectividad()
                try {
                    pokemon_jugadorx.recibir_Ataque()
                }catch(){
                    if (pokemon_jugadorx.vida =< 0){

                    }
                }

            }
        } //fin del while


    }
}

    */