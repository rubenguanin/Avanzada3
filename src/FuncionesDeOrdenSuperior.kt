//Si recibe como parametro una funcion, se le llama funcion de orden superior
//Si retorna una funcion, se le llama funcion de orden superior

    //Estructura
    //fun nombreFuncion(parametros: TipoParametros, operacion(funcion): (TipoEntrada) -> TipoSalida): TipoRetorno {
    //cuerpo de la funcion
    //return funcion(parametros)}

//fos: Funcion de orden superior
//fos que reciba dos numeros y una operacoin matematica y retornara la respuesta de la operacion matematica

fun calcular(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

//crear una fos que reciba una lista de numeros y una fucion que permita transformar cada elemento

fun transfromarLista(lista: List<Int>, transformar: (Int) -> Int): List<Int> {
    val resultado = mutableListOf<Int>()
    for (num in lista) {
        resultado.add(transformar(num))
    }
    return resultado
}

fun transfromarList(lista: List<Int>, transformar: (Int) -> Int): List<Int> {
    return lista.map { transformar(it) }
}


fun main() {
    val suma = calcular(2, 3) { x, y -> x + y }
    val multiplicacion = calcular(4, 6) { x, y -> x * y }
    val modulo = calcular(10, 3) { x, y -> x % y }
    val potencia = calcular(2, 3) { x, y -> Math.pow(x.toDouble(), y.toDouble()).toInt() }
    val maximo = calcular(10, 20) { x, y -> if (x > y) x else y }

    println(suma)
    println(multiplicacion)
    println(maximo)

    val lista = listOf(1, 2, 3, 4, 5)
    val listaTransformada = transfromarLista(lista) { it * it }
    val listaTransformada2 = transfromarList(lista) { it * it}
    println(listaTransformada)
    println(listaTransformada2)
}
