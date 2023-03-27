
package clases

/**
 * Interfaz para los metodos necesario de un Pokemon en combate.
 * @param recibir_ataque inicia el combate y actualiza los puntos de vida segun parametros que recibe tambien de la funcion comprobar_efectividad
 *@return : actualizacion de puntos de vida o nombra al ganador si su Pokemon contrincante llega a 0 puntos de vida.
 * @param comprobar_efectividad : realiza la comparacion entre los tipos de los Pokemons elegidos.
 * @return : -El valor del multiplicador que debe aplicarse en el ataque.
 */
interface pokemon_interfaz {

    abstract fun recibir_Ataque(danio: Int, efectividad: Double): Boolean
    abstract fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double

}


