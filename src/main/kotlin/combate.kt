
import proyecto_final.clases.Ataque
import proyecto_final.clases.Pokemon
import proyecto_final.clases.Tipo
interface combate {
    //creamos la interface de combate y usamos las funciones necesarias antes descritas

    //fun atacar(pokemonAtacado: Pokemon, opcion_Ataque: Int)
    //fun recibir_Ataque(danio: Int, tipo: Tipo): Boolean
    //fun comprobar_efectividad(tipoAtaque: Tipo, tipoDefensa: Tipo): Double


        //Se declara el valor del ataque segun el que elija//
        fun menu_ataque(): Int {
            println(
            "¿Qué ataque vas a emplear? Seleccione con un nº\n" +
                    "1-arañazo\n" +
                    "2-guantazo\n" +
                    "3-cabezazo\n"
            )
            var opcion = readln().toInt()
            return when (opcion) {
                1 -> 8
                2 -> 10
                3 -> 30
                else -> throw Exception("Debes elegir una de las tres opciones anteriores.")
            }
        }
    }





    fun imprimir_pokemons_disponibles(){
        println("Escoja con el nº correspondiente a uno de los siguientes pokemon\n" +
                "1-Pikachu\n" +
                "2-Squirtle\n" +
                "3-Bulbasur\n" +
                "4-Geodude\n")

    }



