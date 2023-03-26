import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo


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




fun combatir(lista_jugadores: MutableMap<String, Pokemon>){

    while (true) {
        for ((jugadorx, pokemon_jugadorx) in lista_jugadores){
            //pokemon_jugadorx.recibir_Ataque(danio)
            println("Turno del $jugadorx : \n")
            var danio= menu_ataque()



        }

        //if (pokemon_jugadorx1.recibir_Ataque(pokemon_jugadorx2.danio, )==true){

    }
}//fin del while

fun menu_ataque():Int{
    println("¿Qué ataque vas a emplear? Seleccione con un nº\n" +
            "1-arañazo\n" +
            "2-guantazo\n" +
            "3-cabezazo\n" +
            "")
    var opcion= readln().toInt()
    var danio=0
            if (opcion==1){
                danio=8
            }
            if (opcion==2){
                danio=10
            }
            if (opcion==3){
                danio=30
            }
    return danio

}

