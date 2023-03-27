/**
 * Clase Pokemon
 * En esta class desarrllamos el elemento Pokemon y almacenamos las funciones que necesita usar.
 *
 *@param crear_pokemons Pokemon ganador tras al actualizacion de puntos de cada jugador por turnos.
 * La iteracion finaliza una vez que uno de los dos se actualiza a 0 o menos puntos.
 *
 * @author: Patricio Cifredo.
 * @author: Sara Sanchez.
 */

package funciones

import proyecto_final.clases.Pokemon

/**
 * @param combatir es la funcion donde se desarrolla el "combate" Pokemon, actualizara la vida de cada uno hasta llegar a 0 puntos,
 * teniendo en cuenta el danio que hace el tipo de ataque y la efectividad de los tipos de Pokemon.
 * @return Pokemon ganador
 * 
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


//funcion elegir ataque
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

/**
 * @param crear_pokemons :Devuelve un Pokemon con sus atributos segun la eleccion en el menu del numero que le corresponde:
 * @param nombre : Hace referencia al Pokemon en cuestion.
 * @param lore : Hace referencia a una breve descripcion del Pokemon concreto que se elige.
 * @param tipo : Hace referencia al tipo del Pokemon, de esta manera podremos determinar la efectividad de sus ataques frente a los ataques de otro Pokemon de mismo o distinto tipo.
 * @param vida :se le ha asignado un valor aleatorio para que asi, incluso cogiendo el mismo Pokemon, la victoria del combate
 * no dependa de quien empieza primero, sino de los ataques elegidos.
 *
 *
 */
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
