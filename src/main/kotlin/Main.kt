
import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo


fun main(args: Array<String>) {


    println(
        "¡BIENVENIDE AL COMBATE, ENTRENADORX!\n" +
         "-----------------------------------------")

    println("Jugadorx 1:\n")
    imprimir_pokemons_disponibles()
    //var jugadorx1=Pokemon()




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



fun combatir(lista_jugadores: MutableMap<String, Pokemon>){

    while (true) {
        for ((jugadorx, pokemon_jugadorx) in lista_jugadores){
            pokemon_jugadorx.recibir_Ataque()
            println("Turno del $jugadorx : \n")
            menu_ataque()
            var opcion= readln().toInt()



        }

        //if (pokemon_jugadorx1.recibir_Ataque(pokemon_jugadorx2.danio, )==true){

    }
}//fin del while

fun menu_ataque(){
    println("¿Qué ataque vas a emplear? Seleccione con un nº\n" +
            "1-arañazo\n" +
            "2-guantazo\n" +
            "3-cabezazo\n" +
            "" +
            "Nota: Solo puede utilizar el cabezazo una vez por partida\n")


}


fun combatir(lista_jugadores: MutableMap<String, Pokemon>){

    while (true) {
        for ((jugadorx, pokemon_jugadorx) in lista_jugadores){
            pokemon_jugadorx.recibir_Ataque()
            println("Turno del $jugadorx : \n")
            menu_ataque()
            var opcion= readln().toInt()



        }

        //if (pokemon_jugadorx1.recibir_Ataque(pokemon_jugadorx2.danio, )==true){

    }
}//fin del while
