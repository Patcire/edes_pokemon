package proyecto_final.clases

class Ataque (nombre: String, danio: Int){

        var nombre="basico1"
                get() {
                        return field
                }
                set(value) {
                        if (nombre.lowercase() in mapa_ataque_pokemon.values) {
                                field = value
                        }
                        else{
                                throw  Exception ("Debe ser un arañazo, guantazo, cabezazo\n")
                        }
                }

        var danio=8
                get() {
                        return field
                }
                set(value) {
                        if (danio in mapa_ataque_pokemon.keys) {
                                field = value
                        }
                        else{
                                throw  Exception ("Debe quitar 8, 10 o 30 puntos de salud\n")
                        }
                }

        companion object{
                //ataques comunes a las 4 clases. la clave corresponde a los puntos de daño base que quita
                private val mapa_ataque_pokemon= mapOf<Int,String>(8 to "arañazo", 10 to "guantazo", 30 to "cabezazo")

        }

}

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

