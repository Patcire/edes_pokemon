package proyecto_final.clases
import java.util.Random
class Ataque (nombre: String, tipo: Tipo, danio: Int){

        var danio = (1..6).shuffled().last()


}