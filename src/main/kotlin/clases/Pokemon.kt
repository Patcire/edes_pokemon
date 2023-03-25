package proyecto_final.clases


class Pokemon (nombre: String, lore: String, tipo: Tipo, vida: Int) {

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


    private var vida = (100..150).random()

        get() {
            return field
        }
        set(value) {
            field = value
        }


    //FUNCION RECIBIR ATAQUE
    fun recibir_Ataque(danio: Int, efectividad: Double): Int {
        vida -= (danio * efectividad).toInt()

        //RECIBIMOS CUANTOS PUNTOS DE VIDA LE QUEDAN
            if (vida > 0) {
                println("$nombre ha impactado con $danio puntos de ataque y te quedan $vida puntos de vida.")
            //SI LOS PUNTOS DE VIDA LLEGAN A 0 O MENOS, SALDRA UN MENSAJE DE DERROTA
            } else if (vida <= 0) {
                println("*************************")
                println("++++$nombre ha sido derrotado++++")
                println("*************************")
            }
            return vida
        }


    init{
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.vida = vida

    }

    override fun toString(): String {
        return super.toString()+"Soy un Pokemon $nombre, de tipo $tipo. $lore, "
    }


}