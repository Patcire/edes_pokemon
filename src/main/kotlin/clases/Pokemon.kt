package proyecto_final.clases


class Pokemon (nombre: String, lore: String, tipo: String, vida: Int) {

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

    var tipo = "planta"

        get() {
            return field
        }
        set(value) {
            if (tipo.lowercase() in lista_tipos_pokemon) {
                field = value
            } else {
                throw Exception("Debe ser tipo planta, agua, electrico o roca\n")
            }
        }

    var fuerza = 10

        get() {
            return field
        }
        set(value) {
            field = value
        }


    var vida = (100..150).random()

        get() {
            return field
        }
        set(value) {
            if (value<=0){
                throw Exception ("Debe ser positiva\n")
            }
            field = value
        }



    init{
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.vida = vida

    }

    //pokemon por defecto
    constructor():this("pikachu", "rata", "electrico", 100)

    companion object{
        private val lista_tipos_pokemon = listOf<String>("planta", "agua", "electrico", "roca")
    }

    override fun toString(): String {
        return "Soy un $nombre, de tipo ${tipo} con $vida puntos de vida.  $lore\n"
    }

    //FUNCION RECIBIR ATAQUE
    fun recibir_Ataque(danio: Int, efectividad: Double): Boolean {

        var vida_a_cero:Boolean=false
        if ((danio * efectividad)<vida){
            vida -= (danio * efectividad).toInt()
            println("$nombre ha impactado con $danio puntos de ataque y te quedan $vida puntos de vida.")}
        else{
            println("*************************\n")
            println("++++la vida de $nombre ha bajado a cero!!!!++++\n")
            println("*************************\n")
            vida_a_cero=true
        }
        return vida_a_cero
    }


    fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double {
        var efectividad = 0.0
        if (this.tipo.lowercase() == "electrico") {
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

        if (this.tipo.lowercase() == "planta") {
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

        if (this.tipo.lowercase() == "roca") {
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

        if (this.tipo.lowercase() == "agua") {
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

}
