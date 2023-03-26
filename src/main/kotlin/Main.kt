import proyecto_final.clases.*

fun main(args: Array<String>) {
    var pokemon_jugadorx1=Pokemon()
    var pokemon_jugadorx2=Pokemon()

    var lista_jugadores = mutableMapOf<String, Pokemon>("Jugadorx 1" to pokemon_jugadorx1, "Jugadorx 2" to pokemon_jugadorx2)

    println(
        "¡BIENVENIDE AL COMBATE, ENTRENADORX!\n" +
         "-----------------------------------------")

    for (jugadorx in lista_jugadores.keys){
        imprimir_pokemons_disponibles()
        var opcion_escogida= readln().toInt()
        when (opcion_escogida){
            1 ->{
                lista_jugadores[jugadorx]= Pokemon("pikachu", "raton amarillo", Tipo("electrico"),  (100..150).random())
                println("$jugadorx ha escogido como pokemon a:\n" +
                        lista_jugadores[jugadorx].toString()
                )
            }
            2->{
                lista_jugadores[jugadorx]= Pokemon("squirtle", "tortuga chula", Tipo("agua"),  (100..150).random())
                println("$jugadorx ha escogido como pokemon a:\n" +
                        lista_jugadores[jugadorx].toString()
                )
            }
            3->{
                lista_jugadores[jugadorx]= Pokemon("bulbasur", "dino plantoso", Tipo("planta"),  (100..150).random())
                println("$jugadorx ha escogido como pokemon a:\n" +
                        lista_jugadores[jugadorx].toString()
                )
            }
            4->{
                lista_jugadores[jugadorx]= Pokemon("geodude", "gymrat que no hace piernas", Tipo("roca"),  (100..150).random())
                println("$jugadorx ha escogido como pokemon a:\n" +
                        lista_jugadores[jugadorx].toString()
                )
            }
        }//fin when
    }//fin for


} //fin del main



//a partir de aquí hay alugnas funciones que utiliza el main



fun combatir(lista_jugadores: MutableMap<String, Pokemon>) {
    while (true) {
        for ((jugadorx, pokemon_jugadorx) in lista_jugadores) {
            println("Es el turno del jugador $jugadorx.\n")
            //dice q no pasan parametros por danio ni tipo
             //var opcion = menu_ataque()
            //var danio = recibir_Ataque(danio = opcion, tipo = comprobar_efectividad(tipoAtaque = tipo.tipo_pokemon_contrincante, tipoDefensa = pokemon_jugadorx.tipo)).toDouble()
            //danio en funcion?
            //var efecto = comprobar_efectividad()

            }

        }
    } //fin del while







