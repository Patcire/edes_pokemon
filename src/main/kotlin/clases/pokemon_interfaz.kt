
package clases

/**
 * Interfaz con las funciones que la clase pokemon debe heredar e implementar.
 * @param recibir_ataque
 *
 * @param comprobar_efectividad
 *
 */
interface pokemon_interfaz {

    abstract fun recibir_Ataque(danio: Int, efectividad: Double): Boolean
    abstract fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double

}


