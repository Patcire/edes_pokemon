package proyecto_final.clases

class Pokemon (nombre: String, lore: String, tipo: Tipo, fuerza: Int, vida: Int) {

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

    var fuerza = 10
        get() {
            return field
        }
        set(value) {
            field = value
        }

    private var vida = 150
        get() {
            return field
        }
        set(value) {
            field = value
        }


    //FUNCION RECIBIR ATAQUE
    fun recibir_Ataque(danio: Int, efectividad: Double): Int {
        val danio_hecho = (danio * efectividad).toInt()
        vida -= danio_hecho
            return vida.toInt()
        //RECIBIMOS CUANTOS PUNTOS DE VIDA LE QUEDAN, SI QUEDAN.
        /*
            if (vida > 0) {
                println("$nombre ha impactado con $danio puntos de ataque y te quedan $vida puntos de vida.")
            } else if (vida <= 0) {
                println("$nombre ha sido derrotado")
            }
            vida.toInt()
        }*/
    }

    init{
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.fuerza = fuerza
        this.vida = vida
    }



}