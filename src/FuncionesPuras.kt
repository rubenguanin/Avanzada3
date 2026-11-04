//fun nombreFuncin (parametros) : Retorna {
//    cuerpo de la funcion
//}
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun sumar2(a: Int, b: Int) = a + b

//prog que calcule un descuento
var descuento = 10

//fun calcularPrecio(precio: Double): Double = precio * descuento / 100

fun calcularPrecio(precio: Double): Double {
    return precio * descuento / 100
}

//Funcion pura y lo que se debe hacer y llegar
fun calcularPrecio2(precio: Double, descueto: Double): Double {
    return precio - (precio * descuento / 100)

}


//Imperativo
fun verificarPositivoImperativo(numero: Int) {
    if (numero > 0) {
        println("Num positivo")
    } else {
        println("Num negativo")
    }
}

//Fun pura
fun esPositivo(numero: Int): Boolean = numero > 0

//Imperativa
fun ObtenerMayor(a: Int, b: Int) {
    if (a > b) {
        println("Numero mayor $a")
    } else
        println("Numero mayor $b")
}

//Fun Pura
fun obtenerMayorPura(a: Int, b: Int): Int = if (a > b) a else b

//Ejercicio
//EXAMNE 50%, PROYECTO 30 Y TAREAS 20
fun calcularNotaFinal(examen: Double, proyectos: Double, tareas: Double): Double =
    (examen * 0.50) + (proyectos * 0.30) + (tareas * 0.20)

fun main() {
    println(calcularNotaFinal(10.0, 20.0, 20.0))
}

