package proyecto_final.clases

<<<<<<< HEAD
class Pokemon (nombre: String, lore: String, tipo: Tipo, vida: Int){
=======
class Pokemon (nombre: String, lore: String, tipo: Tipo, fuerza: Int, vida: Int) {
>>>>>>> 43e7bcf8f3c51621b05e65fa2a58d75e2d856b3a

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
<<<<<<< HEAD
=======
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var fuerza = 10
>>>>>>> 43e7bcf8f3c51621b05e65fa2a58d75e2d856b3a
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
        this.vida = vida
    }



}