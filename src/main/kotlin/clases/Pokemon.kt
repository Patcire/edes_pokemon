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

    init{
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.vida = vida

    }

    override fun toString(): String {
        return "Soy un $nombre, de tipo ${tipo.tipo_pokemon} con $vida puntos de vida.  $lore\n"
    }

    //pokemon por defecto
    constructor():this("pikachu", "rata", Tipo("electrico"), 100)

}