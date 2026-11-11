//fun nombreFuncin (parametros) : Retorna {

// cuerpo de la funcion

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


//listas

fun duplicarLista(lista: List<Int>): List<Int> {

//it para recorrer todos los elementos de la lista

    return lista.map { it -> it * 2 }

}


fun dup(lista: List<Int>): List<Int> = lista.map {
    it
    2
}


fun filtrarPares(numeros: List<Int>): List<Int> = numeros.filter { it % 2 == 0 }


fun sumarLista(numeros: List<Int>): Int = numeros.sum()


fun promedioLista(lista: List<Int>): Double = lista.average()

fun maximo(lista: List<Int>): Int = lista.max()

fun minimo(lista: List<Int>): Int = lista.min()


//crear dos funciones la primera para obetener el cubo de un numero y luego funcnion

// que permita encontrar los impares de una liysta y una vez eso crear una funcion que utilice esto

fun cuadrado(numero: Int): Int = numero * numero

fun impares(numero: Int): Boolean = numero % 2 != 0

fun procesar(lista: List<Int>): List<Int> = lista.map { cuadrado(it) }.filter { impares(it) }


//temperaturas de valores num a string

fun clasificarTemp(lista: List<Int>): List<String> {

    return lista.map {

        when {

            it < 4 -> "Frio"

            it <= 8 -> "Templado"

            else -> "caliente "

        }

    }

}


//crear una funcion pura que permita contar los numeros pares de una lista


fun contarPares(numeros: List<Int>): Int = numeros.count { it % 2 == 0 }


fun main() {

//println(calcularNotaFinal(10.0, 20.0, 20.0))


    val num = listOf(1, 2, 3, 4, 5)


    val resultado = duplicarLista(num)

    val rel = dup(num)

    println(rel)

    println(num)

    println(resultado)


    val pares = filtrarPares(num)

    println(pares)


    val suma = sumarLista(num)

    println(suma)


    val procesarEjemplo = procesar(num)

    println(procesarEjemplo)


    val temperatura = clasificarTemp(num)

    println(temperatura)


    val contar = contarPares(num)

    println(contar)

}

