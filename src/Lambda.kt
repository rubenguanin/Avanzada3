//LAMBDAS

//val nombre = {parametros -> cuerpo }
val sum = { x: Int, y: Int -> x + y }


//Fucion Nularia
fun obtenerMensaje(): String = "Devuelve mensaje"

val mensaje = { -> "Devuelve mensaje" }

val ms: () -> String = { "Devuelve ms " }  //manera tradicional


val cubo = { x: Int -> x * x * x}

val suma = { x: Int, y: Int -> x + y }

fun calcularCosto(precio: Double, cantidad: Int, descuento: Double, impuesto: Double, transporte: Double): Double {
    val subtotal = precio * cantidad
    val descuento = subtotal * (descuento / 100)
    val baseImponible = subtotal - descuento



    return baseImponible + (baseImponible * (impuesto / 100)) + transporte
}

val calCostoLambdaTradicional: (Double, Int, Double, Double, Double) -> Double =
    { precio, cantidad, descuento, impuesto, transporte: Double ->
        val subtotal = precio * cantidad
        val descuento = subtotal * (descuento / 100)
        val baseImponible = subtotal - descuento



        baseImponible + (baseImponible * (impuesto / 100)) + transporte
    }

val calCostoLambda = { precio: Double, cantidad: Int, descuento: Double, impuesto: Double, transporte: Double ->

    val subtotal = precio * cantidad
    val descuento = subtotal * (descuento / 100)
    val baseImponible = subtotal - descuento
    baseImponible + (baseImponible * (impuesto / 100)) + transporte
}

data class Estudiante(val nombre: String, val nota: Double)


val crearEstudiante = { nombre: String, nota: Double -> Estudiante(nombre, nota) }


val aprob = { estudiante: Estudiante ->
    if (estudiante.nota >= 7.0) {
        "Estudiante paso"
    } else "Estudiante quedo"
}

val aprobTradicional: (Estudiante) -> String = { est ->
    if (est.nota >= 7.0) {
        "${est.nombre} pasó con ${est.nota}"
    } else {
        "${est.nombre} se quedó con ${est.nota}"
    }
}



//UNIT:
//Funcion que no devuelva algo
val mostrarEstudiante = { nombre: String, nota: Double -> Unit }

fun main() {
    println(mensaje())
    println(ms())

    println(cubo(3))
    println(sum(10, 20))

    val compra = calcularCosto(10.0, 1, 10.0, 5.0, 30.0)

    val compra2 = calCostoLambdaTradicional(10.0, 1, 10.0, 5.0, 30.0)

    val compra3 = calCostoLambda(10.0, 1, 10.0, 5.0, 30.0)

    println(compra)
    println(compra2)
    println(compra3)


    val crearEst = crearEstudiante("Ruben", 20.0)
    println(crearEst)

    val paso = aprob(crearEst)
    println(paso)

}


//Heron area= raiz cuadrara del semi perimetro

//Practicando Tradicinal
//suma : (Int , Int ) -> Int = {a,b -> a+b}