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
//generar una fos que genere una factura, para ello se debe calcular los impuestos y descuentos mediante
//funciones idenpenidntes

fun generarFactura(
    precio: Double, cantidad: Int,
    impuesto: (Double) -> Double, descuento: (Double) -> Double
): Double {
    val subtotal = precio * cantidad
    val iva = impuesto(subtotal)
    val precioFinal = descuento(iva)
    return precioFinal
}

fun calcularPrecioFinal(
    montoTotal: Double,
    descuento: (Double) -> Double
): Double {
    return montoTotal - descuento(montoTotal)
}

fun precioConImpuesto(precio: Double): Double {
    val impuesto = 0.15 // 15% de impuesto
    return precio + (precio * impuesto)
}

fun precioConDescuento(precio: Double): Double {
    val descuento = 0.10 // 10% de descuento
    return precio - (precio * descuento)
}

//fos que recibe calificaicion de un estudiante y tambien recibe una funcion
// que determine su condicion academica (>=9 , "Excelente ", >=7 "Aprobado", >=5 "Recuperacion", <5 "Reprobado")

fun calificaionesEstudiante(
    nota: Double,
    condicion: (Double) -> String
): String {
    return condicion(nota)
}

//fos que recibe un procentaje y retorna una funcion
fun crearIncremento(porcentaje: Double): (Double) -> Double {
    return { cantidad -> cantidad + (cantidad * porcentaje / 100) }
}

//fos de seguridad: recibe una clave y reciba una  que va a verificar condiciones de seguridad

fun seguridad(
    clave: String,
    verificar: (String) -> Boolean
): String {
    return if (verificar(clave)) {
        "Acceso permitido"
    } else {
        "Acceso denegado"
    }
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
    val listaTransformada2 = transfromarList(lista) { it * it }
    println(listaTransformada)
    println(listaTransformada2)

    val total = generarFactura(
        11.25, 6,
        { x -> x * 0.15 }, { it * 0.25 })
    println(total)

    val totalCompra = calcularPrecioFinal(100.0, {
        if (it >= 150) it * 0.20 else it * 0.05
    })
    println(totalCompra)

    val notaEstudiante = calificaionesEstudiante(5.5)
    { it ->
        if (it >= 9) {
            "Excelente"
        } else if (it >= 7) {
            "Aprobado"
        } else if (it >= 5) {
            "Recuperacion"
        } else {
            "Reprobado"
        }
    }
    println(notaEstudiante)

    val notaEstudianteconWhen = calificaionesEstudiante(5.5)
    { it ->
        when {
            it >= 9 -> "Excelente"
            it >= 7 -> "Aprobado"
            it >= 5 -> "Recuperacion"
            else -> "Reprobado"
        }
    }
    println(notaEstudianteconWhen)

    //Cuando se devuelva uina fucnion debo crear un nuevo estado para ella
    val incremento10 = crearIncremento(10.0)
    val cantidad1 = incremento10(200.0)
    println(cantidad1)

    val incremento50 = crearIncremento(50.0)
    val cantidad2 = incremento50(200.0)
    println(cantidad2)


    val ingreso = seguridad("Admin2026") { clave ->
        clave.length >= 0 && clave.any { it.isDigit() } && clave.any { it.isUpperCase() }
    }

    val ingresoFalso = seguridad("Admin") { clave ->
        clave.length >= 0 && clave.any { it.isDigit() } && clave.any { it.isUpperCase() }
    }
    println(ingreso)
    println(ingresoFalso)
}




