//Invocacion básica
fun saludar() {
    println("Bienvenido prog funcional")
}

//Invocacion en secuencia
fun iniciar() {
    println("Iniciando....")
}

fun procesar() {
    println("Procesando...")
}

fun finalizar() {
    println("Finalizando...")
}

//Métodos con parámetros
fun imprimirNombre(nombre: String, edad: Int) {
    println("El nombre es $nombre con edad de $edad años ")

}

fun calcularArea(base: Double, altura: Double) {
    var area = (base * altura) / 2
    println("Ares es:  $area")

}

fun suma(a: Int, b: Int): Int {
    return a + b

}

//-----------------------------------------------------
fun sumar2(a: Int, b: Int): Int = a + b
fun esPar(numero: Int): Boolean = numero % 2 == 0

fun promedio(p1: Double, p2: Double, p3: Double): Double = (p1 + p2 + p3) / 3


class Calculadora{
    fun restar (a: Int, b: Int, c: Int) : Int = a-b-c

}

class Persona (var nombre: String, var edad: Int){


}


fun main() {
    saludar()

    //Se tomara el orden en el que se invoca la funcion
    iniciar()
    procesar()
    finalizar()

    imprimirNombre("Ruben", 23)
    calcularArea(5.0, 10.0)

    val resultado = suma(1, 2)
    println(resultado)

    println(suma(5, 6))

    println(sumar2(6, 6))
    println(esPar(11))

    println(promedio(3.0, 3.0, 3.0))

    val calculadora = Calculadora()
    calculadora.restar(1,2,6)


}