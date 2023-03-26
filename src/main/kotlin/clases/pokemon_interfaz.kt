package clases
interface pokemon_interfaz {

    abstract fun recibir_Ataque(danio: Int, efectividad: Double): Boolean
    abstract fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double

}


