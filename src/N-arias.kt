//Ceficientes a b y c de una ec cuadratica
//discriminante: d = b
import kotlin.math.pow
fun evaluarSoluciones(a: Double, b: Double, c: Double): String {
    val discriminante = b.pow(2) - (4 * a * c)

    return when {
        discriminante > 0 -> {
            "Dos sol reales: $discriminante"
        }
        discriminante == 0.0 -> {
            "Tiene una solución real doble: x = $discriminante"
        }
        else -> "No tiene soluciones reales."
    }
}

// desarrolar una funcion que reciba las coordenadas de dos puntos en un
// plano cartesiano y calcule el punto medio del segmento
//Mx = x1+x2/2 y My= y1 +y2/2
// la funcion debe devolver las dos coordenadas del punto medio

data class Punto(val x: Double, val y: Double)

fun calcularPuntoMedio(p1: Punto, p2: Punto): Punto = Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2)


fun main() {
    val a = 1.0
    val b = -5.0
    val c = 6.0
    println(evaluarSoluciones(a, b, c))

    val x1 = 1.0
    val y1 = 1.0
    val punto1 = Punto(x1, y1)


    val x2 = 1.0
    val y2 = 1.0
    val punto2 = Punto(x2, y2)

    val puntoMedio = calcularPuntoMedio(punto1, punto2)
    println(puntoMedio)


}