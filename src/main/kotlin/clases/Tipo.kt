package proyecto_final.clases

class Tipo (tipo_pokemon:String, tipo_ataque: String) {

    var tipo_pokemon= "planta"
        get() {
            return field
        }
        set(value) {
            if (tipo_pokemon.lowercase() in lista_tipos_pokemon) {
                field = value
            }
           else{
               throw  Exception ("Debe ser tipo planta, agua, electrico o roca\n")
            }
        }

    var tipo_ataque="basico"
        get() {
            return field
        }
        set(value) {
            if (tipo_ataque.lowercase() in lista_ataque_pokemon) {
                field = value
            }
            else{
                throw  Exception ("Debe ser un ataque básico o crítico \n")
            }
        }

    init{
        this.tipo_pokemon= tipo_pokemon
        this.tipo_ataque= tipo_ataque
    }

    companion object{
        val lista_tipos_pokemon= listOf<String>("planta", "agua", "electrico", "roca")
        val lista_ataque_pokemon= listOf<String>("basico", "critico")
    }

}

