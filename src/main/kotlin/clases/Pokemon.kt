package proyecto_final.clases

import clases.pokemon_interfaz


class Pokemon (nombre: String, lore: String, tipo: String, vida: Int) : pokemon_interfaz {

    var nombre = "defecto"
        get() {
            return field
        }
        set(value) {
            if (value in lista_pokemon){
            field = value}
            else{
                throw Exception ("Error. Debe ser un pikachu, bulbasur, squirtle o geodude\n")
            }
        }

    var lore = "descripcion"


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

    //constructor secundario, pokemon por defecto
    constructor():this("pikachu", "rata", "electrico", 100)

    companion object{
        private val lista_pokemon = listOf<String>("bulbasur", "squirtle", "pikachu", "geodude")
        private val lista_tipos_pokemon = listOf<String>("planta", "agua", "electrico", "roca")
    }

    override fun toString(): String {
        return "Soy un $nombre, de tipo ${tipo} con $vida puntos de vida.  Sobre mí debes saber que soy: $lore\n"
    }

    //FUNCION RECIBIR ATAQUE
    override fun recibir_Ataque(danio: Int, efectividad: Double): Boolean {

        var vida_a_cero:Boolean=false
        if ((danio * efectividad)<vida){
            vida -= (danio * efectividad).toInt()
            println("------------------------------------")
            println("$nombre ha sido impactado con ${(danio*efectividad).toInt()} de ataque y le quedan $vida puntos de vida.\n")
            println("------------------------------------")
        }

        else{
            println("*************************\n")
            println("++++la vida de $nombre ha bajado a cero!!!!++++\n")
            println("*************************\n")
            vida_a_cero=true
        }
        return vida_a_cero
    }


    override fun comprobar_efectividad(tipo_pokemon_contrincante: String): Double {

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
