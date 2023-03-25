
import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo


fun main(args: Array<String>) {


    println(
        "¡BIENVENIDE AL COMBATE, ENTRENADORX!\n" +
         "-----------------------------------------")

    println("Jugadorx 1:\n")
    imprimir_pokemons_disponibles()
    var jugadorx1=Pokemon()




}


//a partir de aquí hay funciones que utiliza el main


fun imprimir_pokemons_disponibles(){
    println("Escoja con el nº correspondiente uno de los siguientes pokemon\n" +
            "1-Pikachu\n" +
            "2-Squirtle\n" +
            "3-Bulbasur\n" +
            "4-Geodude\n")

}

fun combatir(){
    var lista_jugadores = arrayListOf<String>("Jugadorx 1", "Jugadorx 2")
    while (true) {
       for (jugadorx in lista_jugadores){

       }


    }

}





