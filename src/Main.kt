fun main() {

    //Estructura de Control

    val number = 5
    //IF
    if (number % 2 == 0) {
        println("El num es par")

    } else {
        println("El num es impar")
    }

    //IF anidado
    if (number >= 7) {
        println("Aprobo la materia")
    } else if ((number >= 5) and (number < 7)) {
        println("Supletorio")
    } else {
        println("Reprobado ")
    }

    //Switch
    val opcion = 1
    when (opcion) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        else -> println("Valor incorrecto")
    }
    println("Escriba")
    val opcion1 = readln().toInt()
    when (opcion1) {
        1 -> println("Uno")
    }

    //For
    for (i in 1..10) { //ascendente
        println(i)
    }

    for (i in 10 downTo 1) {// descender
        println(i)
    }
    for (i in 1..10 step 2) { //para ir saltar  de 2 en 2
        println(i)
    }
    for (i in 10 downTo 1 step 2) {// descender
        println(i)
    }

    //While
    var i = 1 //siempre con var
    while (i <= 10) {
        println(i)
        i++
    }

    //Do-While
    var j = 0
    do {
        println(j)
        j++
    } while (j <= 10)


}