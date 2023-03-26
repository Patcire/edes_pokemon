import proyecto_final.clases.*

fun main(args: Array<String>) {

    var pokemon_jugador1=Pokemon()
    var pokemon_jugador2=Pokemon()

    var lista_jugadores = mutableMapOf<String, Pokemon>("Jugadorx 1" to pokemon_jugador1, "Jugadorx 2" to pokemon_jugador2)

    println(
        "¡BIENVENIDE AL COMBATE, ENTRENADORX!\n" +
         "-----------------------------------------")

    for (jugador in lista_jugadores.keys){
        println("$jugador :")
        imprimir_pokemons_disponibles()
        var opcion_escogida= readln().toInt()
        when (opcion_escogida){
            1 ->{
                lista_jugadores[jugador]= Pokemon("pikachu", "raton amarillo", "electrico",  (100..150).random())
                println("$jugador ha escogido como pokemon a:\n" +
                        lista_jugadores[jugador].toString()
                )
            }
            2->{
                lista_jugadores[jugador]= Pokemon("squirtle", "tortuga chula", "agua",  (100..150).random())
                println("$jugador ha escogido como pokemon a:\n" +
                        lista_jugadores[jugador].toString()
                )
            }
            3->{
                lista_jugadores[jugador]= Pokemon("bulbasur", "dino plantoso", "planta",  (100..150).random())
                println("$jugador ha escogido como pokemon a:\n" +
                        lista_jugadores[jugador].toString()
                )
            }
            4->{
                lista_jugadores[jugador]= Pokemon("geodude", "gymrat que no hace piernas", "roca",  (100..150).random())
                println("$jugador ha escogido como pokemon a:\n" +
                        lista_jugadores[jugador].toString()
                )
            }
        }//fin when
    }//fin for


} //fin del main



//a partir de aquí hay alugnas funciones que utiliza el main



fun combatir(lista_jugadores: MutableMap<String, Pokemon>) {
    while (true) {
        for ((jugador, pokemon_jugador) in lista_jugadores) {
            println("Es el turno del $jugador.\n")
             var ataque=menu_ataque()


            }

        }
    } //fin del while

fun imprimir_pokemons_disponibles(){
    println("Escoja con el nº correspondiente a uno de los siguientes pokemon\n" +
            "1-Pikachu\n" +
            "2-Squirtle\n" +
            "3-Bulbasur\n" +
            "4-Geodude\n")

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




