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
                                throw  Exception ("Debe ser un ataque básico1, básico2 o crítico \n")
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
                private val mapa_ataque_pokemon= mapOf<Int,String>(8 to "basico1", 10 to "basico2", 30 to "critico")

                //mapas con los nombres de los ataques  comunes para cada tipo de pokemon. Crítico se llama igual
                val mapa_ataque_electricos=mapOf<Int,String>(8 to "impactrueno", 10 to "rayo")
                val mapa_ataque_roca=mapOf<Int,String>(8 to "mazazo", 10 to "montaña")
                val mapa_ataque_planta=mapOf<Int,String>(8 to "tallo", 10 to "raiz")
                val mapa_ataque_agua=mapOf<Int,String>(8 to "salpicadura", 10 to "tromba")
        }

}