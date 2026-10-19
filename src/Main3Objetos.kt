//Primera forma
class Persona {
    var nombre: String = ""
    var edad: Int = 0
    var estatura: Double = 0.0
}

//Segunda forma (a usar )
class Vehiculo(var marca: String, var precio: Int, var color: String, var cilindraje: Double)


//Funcinones
var velocidadActual: Int = 0

fun encender() {
    println("vehiculo enciende")
}

fun apagar(): String {
    return "Se apaga vehiculo"
}

fun acelerar(incremento: Int): Int {
    velocidadActual += incremento
    return velocidadActual

}

fun frenar(decremento: Int): Int {
    velocidadActual -= decremento
    if (velocidadActual < 0) {
        velocidadActual = 0

    }
    return velocidadActual
}

fun pitar(veces: Int): String {
    var sonido = ""
    for (i in 1..veces) {
        sonido += "beep "
    }
    return sonido
}




fun encender(vehiculo: Vehiculo) {

}

fun main() {

    //siempre sera val para crear la instancia
    val carro = Vehiculo("Kia", 10000, "verde", 1.5)

    println(carro.marca) //get
    carro.precio = 17000 //set
    println(carro)

    fun mostartDetalles (){
        println(carro.marca)
        println(carro.precio)
        println(carro.color)
        println(carro.cilindraje)
    }


    mostartDetalles()
    encender()
    println(acelerar(10))
    println(frenar(2))

    println(pitar(10))
    println(apagar())





}

