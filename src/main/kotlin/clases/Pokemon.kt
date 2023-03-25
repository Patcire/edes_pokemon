package proyecto_final.clases

class Pokemon (nombre: String, lore: String, tipo: Tipo, vida: Int){

    var nombre = "defecto"

        get() {
            return field
        }
        set(value) {
            field = value
        }

    var lore = "descripcion"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var tipo = Tipo("planta")
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var vida = 150
        get() {
            return field
        }

        set(value) {
            field = value
        }



    fun atacar() {
        println("$nombre ha atacado!")

    }


    init{
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.vida = vida
    }




    /*
     val Pikachu = Pokemon("Pikachu", "Ratón eléctrico, el más popular del mundo Pokemon.", Tipo.Electrico, 20, 80)
     val Squirtle = Pokemon("Squirtle", "Cuando se siente en peligro, se esconde en su caparazón y escupe chorros de agua por la boca.", Tipo.Agua, 20, 80)
     val Bulbasur = Pokemon("Bulbasur", "A Bulbasaur es fácil verle echándose una siesta al sol.", Tipo.Planta, 20, 80)
     val Geodude = Pokemon ("Geodude", "Se suele encontrar en senderos de montaña y sitios parecidos. Conviene andar con cuidado para no pisarlo sin querer y provocar su enfado.", Tipo.Roca, 20, 80)

     */

    /*
    private fun getEfectividad(tipoAtacante: Tipo, tipoDefensor: Tipo): Double {
        val tablaEfectividad = mapOf(
            Pair(Tipo.Electrico, Tipo.Roca) to 0.0,
            Pair(Tipo.Electrico, Tipo.Agua) to 2.0,
            Pair(Tipo.Electrico, Tipo.Electrico) to 0.0,
            Pair(Tipo.Electrico, Tipo.Fuego) to 0.0,
            Pair(Tipo.Electrico, Tipo.Planta) to 2.0,

            Pair(Tipo.Roca, Tipo.Roca) to 2.0,
            Pair(Tipo.Roca, Tipo.Agua) to 0.5,
            Pair(Tipo.Roca, Tipo.Electrico) to 0.0,
            Pair(Tipo.Roca, Tipo.Fuego) to 0.0,
            Pair(Tipo.Roca, Tipo.Planta) to 2.0,

            Pair(Tipo.Agua, Tipo.Roca) to 2.0,
            Pair(Tipo.Agua, Tipo.Agua) to 0.0,
            Pair(Tipo.Agua, Tipo.Electrico) to 2.0,
            Pair(Tipo.Agua, Tipo.Fuego) to 2.0,
            Pair(Tipo.Agua, Tipo.Planta) to 0.5,

            Pair(Tipo.Planta, Tipo.Agua) to 2.0,
            Pair(Tipo.Planta, Tipo.Planta) to 0.0,
            Pair(Tipo.Planta, Tipo.Fuego) to 2.0,
            Pair(Tipo.Planta, Tipo.Electrico) to 0.5,
            Pair(Tipo.Planta, Tipo.Roca) to 0.5
        )
        return tablaEfectividad.getOrDefault(Pair(tipoAtacante, tipoDefensor), 1.0)
    }
    */


}