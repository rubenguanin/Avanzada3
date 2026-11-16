import kotlin.math.pow
import kotlin.math.sqrt

//crea una clase tiangulo que reciba las coordenadas de los tres vertices, crear funciones labmbda que determine:
// la distancia entres los 3 pares de puntos
//2) perimetro de la figura
//3) el area me diante la formula de heron
data class Triangulo(val x1: Double, val y1: Double,val x2: Double, val y2: Double,val x3: Double, val y3: Double)


//val calcularDistancia: (Double, Double, Double, Double) -> Double = { ax, ay, bx, by ->
//    sqrt((bx - ax).pow(2) + (by - ay).pow(2))
//}
val distancia = { p1 : Triangulo , p2 : Triangulo,p3:Triangulo -> sqrt(p2.x1-p1.x2-p3.x3).pow(2) + (p3.y1-p2.y2-p1.y3).pow(2) }
val calculadistancia = { }
val perimetro = { }

















// ==========================================
// FUNCIONES LAMBDA (Puras y sin efectos)
// ==========================================

// Lambda auxiliar para calcular la distancia euclidiana entre dos puntos: d = √((x2 - x1)² + (y2 - y1)²)
val calcularDistancia: (Punto, Punto) -> Double = { p1, p2 ->
    sqrt((p2.x - p1.x).pow(2) + (p2.y - p1.y).pow(2))
}

// 1) Lambda que determina las distancias entre los 3 pares de puntos del triángulo
val obtenerLados: (Triangulo) -> Triple<Double, Double, Double> = { t ->
    val ladoA = calcularDistancia(t.v1, t.v2)
    val ladoB = calcularDistancia(t.v2, t.v3)
    val ladoC = calcularDistancia(t.v3, t.v1)
    Triple(ladoA, ladoB, ladoC)
}

// 2) Lambda que determina el perímetro de la figura sumando sus 3 lados
val calcularPerimetro: (Triangulo) -> Double = { t ->
    val (a, b, c) = obtenerLados(t)
    a + b + c
}

// 3) Lambda que determina el área mediante la fórmula de Herón: A = √(s * (s - a) * (s - b) * (s - c))
val calcularAreaHeron: (Triangulo) -> Double = { t ->
    val (a, b, c) = obtenerLados(t)
    val s = calcularPerimetro(t) / 2.0 // Semiperímetro
    sqrt(s * (s - a) * (s - b) * (s - c))
}

// ==========================================
// COMPROBACIÓN EN EL MAIN
// ==========================================
fun main() {
    // Ejemplo con un triángulo rectángulo clásico de base 3 y altura 4
    val vertice1 = Punto(0.0, 0.0)
    val vertice2 = Punto(3.0, 0.0)
    val vertice3 = Punto(0.0, 4.0)

    val triangulo = Triangulo(vertice1, vertice2, vertice3)

    val (lado1, lado2, lado3) = obtenerLados(triangulo)
    val perimetro = calcularPerimetro(triangulo)
    val area = calcularAreaHeron(triangulo)

    println("Vértices: $triangulo")
    println("1) Distancias (lados): Lado 1 = $lado1, Lado 2 = $lado2, Lado 3 = $lado3")
    println("2) Perímetro: $perimetro")
    println("3) Área (Fórmula de Herón): $area")
}