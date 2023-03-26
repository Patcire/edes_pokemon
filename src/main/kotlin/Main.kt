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
        } //fin when
    }//fin for


} //fin del main


//a partir de aquí hay alugnas funciones que utiliza el main


    fun imprimir_pokemons_disponibles(){
        println("Escoja con el nº correspondiente a uno de los siguientes pokemon\n" +
                "1-Pikachu\n" +
                "2-Squirtle\n" +
                "3-Bulbasur\n" +
                "4-Geodude\n")

    }

    fun combatir(lista_jugadores: MutableMap<String, Pokemon>) {
        var opcion = proyecto_final.clases.menu_ataque()
        //val danio = opcion * efectividad
        //val efectivo = comprobar_efectividad()
        while (true) {
            for ((jugadorx, pokemon_jugadorx) in lista_jugadores) {
                println("Es el turno del jugador $jugadorx.\n")
                //dice q no pasan parametros por danio ni tipo


                }
            }


            }
        //fin del while

    //Se declara el valor del ataque segun el que elija
    fun menu_ataque(): Int {
        println(
            "¿Qué ataque vas a emplear? Seleccione con un nº\n" +
                    "1-arañazo\n" +
                    "2-guantazo\n" +
                    "3-cabezazo\n"
        )
        var opcionAtaque = readLine()!!.toInt()
        return opcionAtaque

        var opcion = readln().toInt()
        return when (opcion) {
            1 -> 8
            2 -> 10
            3 -> 30
            else -> throw Exception("Debes elegir una de las tres opciones anteriores.")


        }
    }
