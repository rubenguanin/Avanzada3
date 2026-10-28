//inmutable
fun main() {

    val numeros1 = listOf(1, 2, 3, 4, 5)

    //mutable
    var numeros2 = mutableListOf(1, 2, 3, 4, 5)

    numeros2.add(6)
    // recorrer e imprimir

    for (i in numeros1) {
        println(i)
    }

    for (i in numeros2) {
        println(i)
    }
    //Por indice
    for (i in numeros2.indices) {
        println(numeros2[i])
    }

    numeros2.forEach { println(it) } //it palabra reservada para referirse al elemento actual de la lista

//    println(numeros2.size) //tamaño de la lista
//    println(numeros2.first()) //primer elemento
//    println(numeros2.last()) //ultimo elemento
//    println(numeros2.contains(3)) //verificar si contiene el elemento
//    println(numeros2.indexOf(3)) //indice del elemento
//    println(numeros2.isEmpty()) //verificar si esta vacia
//    println(numeros2.isNotEmpty()) //verificar si no esta vacia


    //eliminar
    numeros2.remove(3) //eliminar elemento
    numeros2.forEach { println(it) }
    numeros2.removeAt(0) //eliminar elemento por indice
    numeros2.forEach { println(it) }
    //numeros2.clear() //eliminar todos los elementos

    //acceder a un elemento (por indice)
    println(numeros2[1]) //acceder al primer elemento
    println(numeros2.get(0))
}