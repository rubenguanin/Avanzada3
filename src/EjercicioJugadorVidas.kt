data class Jugador(val nombre: String, val vidas: Int = 5, val puntos: Int = 0)


fun recibirAtaque(jugador: Jugador): Jugador = jugador.copy(
    vidas = jugador.vidas - 1
)


fun obtieneRecompensas(jugador: Jugador, cantidadP: Int): Jugador = jugador.copy(puntos = jugador.puntos + cantidadP)


fun recuperarVida(jugador: Jugador): Jugador = jugador.copy(vidas = jugador.vidas + 1)


fun main() {


    val jugadorInicial = Jugador(nombre = "Ruben")

    println(jugadorInicial)


    val jugadorAtacado = recibirAtaque(jugadorInicial)

    println(jugadorAtacado)


    val jugadorConRecompensa = obtieneRecompensas(jugadorAtacado, 100)

    println(jugadorConRecompensa)


    val jugadorVidas = recuperarVida(jugadorConRecompensa)

    println(jugadorVidas)


}


































































