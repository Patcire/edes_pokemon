
## <p><u>·PROYECTO EDES_POKEMON.</u></p>

Hemos desarollado un pequeño programa que simula el combate Pokemon entre dos jugadores, los cuales 
juegan un duelo contra otrx adversarix, cada unx con un único Pokemon. <br>

-**Evolución del proyecto**: El planteamiento y diseño inicial del proyecto contaba con varias clases
y métodos. Sin embargo, en la fase de implementación, se observaron diversos errores inherentes al propio diseño, donde las clases
se solapaban en muchos ámbitos o directamente no ayudabanÇ/aportaban al desarrollo de la app. <br>
<br>
Finalmente el proyecto se sustenta en: una única clase (_Pokemon_), una interfaz de la que Pokemon hereda sus métodos,
un archivo .kt para funciones que luego importa el main y el propio main, que ejecuta el juego.

## <p><u>·Pokemon.</p></u>
Hemos realizado una **_clase_** para Pokemon donde determinamos los atributos de clase, hemos comprobado la efectividad 
de los ataques teniendo en cuenta el tipo de los Pokemons que están combatiendo, ya que según éstas tendran una bonificación, 
disminución o ningún efecto sobre la puntuación de daño que realizan. <br> <br>
La vida será generada de forma aleatoria dentro de un rango, de ésta manera no habrá combates cuyo final este predestinado 
según cual de los dos jugadores comienza antes, en el caso de que escogiesen ambos el mismo Pokemon o se tienda a elegir un 
Pokemon concreto porque de forma predeterminada tenga más puntos de vidas que otro.

### <p><u>·Funcionamiento del combate.</u></p>

Al iniciar el juego, cada jugador contará con un menú de dónde podrá elegir un Pokemon. Hemos implementedo la posibilidad
de que ambos puedan elegir el mismo, ya que no es restrictivo que en un combate Pokemon se use el mismo Pokemon para luchar. Su efectividad se tendrá en cuenta.

Una vez elegidos los Pokemons comenzará el combate y ambos jugadores podrán elegir el tipo de ataque que desean realizar.
Cuentan con:

·Dos ataques más básicos donde realizarán un daño predeterminado 

·Un tercer ataque a modo de
¨crítico¨, el cual realiza bastante más daño que los dos anteriores.

Una vez la vida de uno de los Pokemons llegue a cero, en programa felicitara al jugador ganador y finalizará el proyecto.


<sub> Nota de lxs desarrolladorxs: Al ser una versión primaria del programa, no se ha contemplado el número de veces de uso de cada tipo de ataque, cualquier
jugador puede elegir cualquiera de los tres tipos de ataques disponibles tantas veces como quiera, hasta que uno de los dos 
reduzca su vida a 0. Leer siguiente punto para más información al respecto.</sub>


## <p><u>·Futuras implementaciones y bug fixes.</u></p>

Al ser una versión preliminar somos conscientes de pequeñas implementaciones que nos gustaría cambiar en el futuro.
Algunas de ellas son:
<ol>
<li>Controlar que sólo puedan usarse, en el Menú elección de Pokemon, los números para los que tiene asignado el menú y siga 
pidiendo ingresar un número correcto hasta que se realice la peticion.</li>
<li>Controlar el número de veces que pueden repetirse los distintos tipos de ataque y su frecuencia:
        <ul>
            <li>Controlar la frecuencia del ataque <i>crítico</i> de forma que sólo pueda usarse tras un número x de ataques básicos.</li>
        </ul>
        <ul>
        <li>Controlar el <i>cooldown</i> del ataque crítico una vez se ha usado.</li>
        </ul>
</li>
<li>Implementar una lista de Pokemons de donde elegir más extensa.</li>
<li>Hacer que los jugadores tengan un equipo de combate completo con 6 Pokemons.</li>
</ol>

## ¡Esperamos que disfrutes!

![imagen del bueno de pikachu](https://p4.wallpaperbetter.com/wallpaper/12/493/179/8-bit-minimalism-pikachu-pokemon-wallpaper-preview.jpg)