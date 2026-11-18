import kotlin.math.pow
import kotlin.math.sqrt

data class Triangulo(
    val x1: Double, val y1: Double,
    val x2: Double, val y2: Double,
    val x3: Double, val y3: Double
)
// sqrt (x2-x1)2 + (y2-y1)2
val Auxdist = { ax: Double, ay: Double, bx: Double, by: Double ->
    sqrt((bx - ax).pow(2) + (by - ay).pow(2))
}

// 1) Distancias (AB / BC / CA)
val distancias = { t: Triangulo ->
    listOf(
        Auxdist(t.x1, t.y1, t.x2, t.y2), // AB = a
        Auxdist(t.x2, t.y2, t.x3, t.y3), // BC = b
        Auxdist(t.x3, t.y3, t.x1, t.y1)  // CA = c
    )
}

// 2) Perímetro (P= a+b+c)
val perimetro = { triangulo: Triangulo ->
    distancias(triangulo).sum()
}

// 3) Fórmula de Herón: sqrt (s * (s - a) * (s - b) * (s - c))
val areaHeron = { t: Triangulo ->
    val lados = distancias(t)
    val s = perimetro(t) / 2.0
    sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]))}

fun main() {
    // base 3 y altura 4 (Perímetro = 12.0, Área = 6.0)
    val triangulo = Triangulo(0.0, 0.0, 3.0, 0.0, 0.0, 4.0)

    println(distancias(triangulo))
    println(perimetro(triangulo))
    println(areaHeron(triangulo))
}