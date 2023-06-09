
package funciones

import proyecto_final.clases.Pokemon

/**
 * Hemos reunido aqui todas las funciones cuyos datos son usados en el desarrollo del programa.
 * Aunarlas en un mismo fichero nos ha hecho mas facil la busqueda de las funciones, reduciendo el numero de ficheros y packages.
 * @param combatir Función principal del programa. Actualiza la vida para cada pokemon en la iteracion de cada uno de los turnos hasta que uno de ellos llegue a 0.
 * Para ello llama a otras funciones ya implementadas en el proyecto. Finaliza con un mensaje de quién ha ganado.
 * @param imprimir_pokemons_disponibles funcion que actualiza la opcion del Pokemon que escogemos entre los disponibles.
 * @param menu_ataque funcion donde se elige una de entre tres opciones de ataque, devuelve el valor del danio base de ataque que sera aplicado en la funcion de recibir_ataque
 * @param crear_pokemons actualiza los parámetros de los dos Pokemons que recibe , para ajustar el pokemon, a las característica de los 4 pokemons a elegir.
 *
 * @author: Sara Sánchez, Patricio Cifredo
 * @since 27/03/2027
 */

fun combatir(pokemon_jugador1: Pokemon, pokemon_jugador2: Pokemon) {
    println("---------------------------------")
    when(pokemon_jugador1.comprobar_efectividad(pokemon_jugador2.tipo)) {
        1.0 -> println("El combate va a estar igualado. ¡Los pokemon son del mismo tipo!\n")
        2.0 -> println("El combate luce interesante. ${pokemon_jugador1.nombre} " +
                "es más efectivo contra ${pokemon_jugador2.tipo}\n")
        0.5 ->  println("El combate luce interesante. ${pokemon_jugador1.nombre}\n " +
                "es menos efectivo contra ${pokemon_jugador2.tipo}\n")
    }
    println("---------------------------------")

    while (true) {
        println("ES EL TURNO DE JUGADORX 1 y ${(pokemon_jugador1.nombre).uppercase()}\n")
        var danio_que_hace=menu_ataque()
        var efectividad_contra_enemigo=pokemon_jugador1.comprobar_efectividad(pokemon_jugador2.tipo)
        var recibir_ataque= pokemon_jugador2.recibir_Ataque(danio_que_hace,efectividad_contra_enemigo)
        if (recibir_ataque==true){
            println("¡JUGADORX 1 Y ${(pokemon_jugador1.nombre).uppercase()} HAN GANADO EL COMBATE!\n")
            break
        }
        println("---------------------------------")
        println("ES EL TURNO DE JUGADORX 2 y ${(pokemon_jugador2.nombre).uppercase()}\n")
        danio_que_hace=menu_ataque()
        efectividad_contra_enemigo=pokemon_jugador2.comprobar_efectividad(pokemon_jugador1.tipo)
        recibir_ataque= pokemon_jugador1.recibir_Ataque(danio_que_hace,efectividad_contra_enemigo)
        if (recibir_ataque==true){
            println("¡JUGADORX 2 Y ${(pokemon_jugador2.nombre).uppercase()} HAN GANADO EL COMBATE!\n")
            break
        }


    }//fin del while
}

fun imprimir_pokemons_disponibles(){
    println("Escoja con el nº correspondiente a uno de los siguientes pokemon\n" +
            "1-Pikachu\n" +
            "2-Squirtle\n" +
            "3-Bulbasur\n" +
            "4-Geodude\n" +
            "" +
            "(la vida será generada aleatoriamente)\n")

}


fun menu_ataque(): Int {
    println(
        "¿Qué ataque vas a emplear? Seleccione con un nº\n" +
                "1-arañazo\n" +
                "2-guantazo\n" +
                "3-cabezazo\n"
    )
    val opcion = readln().toInt()
    return when (opcion) {
        1 ->{
            println("Has escogido arañazo\n")
            8
        }
        2 -> {
            println("Has escogido guantazo\n")
            10
        }
        3 ->{
            println("Has escogido cabezazo\n")
            30
        }
        else -> throw Exception("Debes elegir una de las tres opciones anteriores.")
    }
}

fun crear_pokemons(mapa_jugador_pokemon:MutableMap<String, Pokemon>){

    for (jugador in mapa_jugador_pokemon.keys){
        println("$jugador :")
        imprimir_pokemons_disponibles()
        val opcion_escogida= readln().toInt()
        when (opcion_escogida){
            1 ->{
                (mapa_jugador_pokemon[jugador])?.nombre="pikachu"
                (mapa_jugador_pokemon[jugador])?.lore="raton amarillo"
                (mapa_jugador_pokemon[jugador])?.tipo="electrico"
                (mapa_jugador_pokemon[jugador])?.vida=(100..150).random()

                println("$jugador ha escogido como pokemon a:\n" +
                        mapa_jugador_pokemon[jugador].toString())
            }

            2->{

                (mapa_jugador_pokemon[jugador])?.nombre="squirtle"
                (mapa_jugador_pokemon[jugador])?.lore="tortuga xula"
                (mapa_jugador_pokemon[jugador])?.tipo="agua"
                (mapa_jugador_pokemon[jugador])?.vida=(100..150).random()

                println("$jugador ha escogido como pokemon a:\n" +
                        mapa_jugador_pokemon[jugador].toString())
            }
            3->{
                (mapa_jugador_pokemon[jugador])?.nombre="bulbasur"
                (mapa_jugador_pokemon[jugador])?.lore="dino planta"
                (mapa_jugador_pokemon[jugador])?.tipo="planta"
                (mapa_jugador_pokemon[jugador])?.vida=(100..150).random()

                println("$jugador ha escogido como pokemon a:\n" +
                        mapa_jugador_pokemon[jugador].toString())


            }
            4->{
                (mapa_jugador_pokemon[jugador])?.nombre="geodude"
                (mapa_jugador_pokemon[jugador])?.lore="gymrat que nunca hizo piernas"
                (mapa_jugador_pokemon[jugador])?.tipo="roca"
                (mapa_jugador_pokemon[jugador])?.vida=(100..150).random()

                println("$jugador ha escogido como pokemon a:\n" +
                        mapa_jugador_pokemon[jugador].toString())

            }
        }//fin when
    }//fin for
}
