package proyecto_final.clases

class Tipo(tipo_pokemon: String) {

    var tipo_pokemon = "planta"
        get() {
            return field
        }
        set(value) {
            if (tipo_pokemon.lowercase() in lista_tipos_pokemon) {
                field = value
            } else {
                throw Exception("Debe ser tipo planta, agua, electrico o roca\n")
            }
        }


    init {
        this.tipo_pokemon = tipo_pokemon
    }


    fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double {
        var efectividad = 0.0
        if (this.tipo_pokemon.lowercase() == "electrico") {
            if (tipo_pokemon_contrincante == "electrico") {
                efectividad = 1.0
            } else if (tipo_pokemon_contrincante == "roca") {
               efectividad= 0.5
            } else if (tipo_pokemon_contrincante == "agua") {
                efectividad= 2.0
            } else {
                efectividad= 2.0
            }
        } //fin condiciones para eléctrico

        if (this.tipo_pokemon.lowercase() == "planta") {
            if (tipo_pokemon_contrincante == "electrico") {
                efectividad= 0.5
            } else if (tipo_pokemon_contrincante == "roca") {
                efectividad= 0.5
            } else if (tipo_pokemon_contrincante == "agua") {
                efectividad=2.0
            } else {
                efectividad= 1.0
            }
        } //fin condiciones para planta

        if (this.tipo_pokemon.lowercase() == "roca") {
            if (tipo_pokemon_contrincante == "electrico") {
                efectividad= 2.0
            } else if (tipo_pokemon_contrincante == "roca") {
                efectividad= 1.0
            } else if (tipo_pokemon_contrincante == "agua") {
                efectividad= 0.5
            } else {
                efectividad= 2.0
            }
        } //fin condiciones para roca

        if (this.tipo_pokemon.lowercase() == "agua") {
            if (tipo_pokemon_contrincante == "electrico") {
                efectividad= 0.5
            } else if (tipo_pokemon_contrincante == "roca") {
                efectividad= 2.0
            } else if (tipo_pokemon_contrincante == "agua") {
                efectividad= 1.0
            } else {
                efectividad= 0.5
            }
        } //fin condiciones para eléctrico

        return efectividad

    }


    companion object {
        private val lista_tipos_pokemon = listOf<String>("planta", "agua", "electrico", "roca")

    }

}

