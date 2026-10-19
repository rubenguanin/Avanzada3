fun main() {
    //vectores y arreglos

    //Vectores
    val numero = IntArray(3)
    numero[0] = 1
    numero[1] = 2
    numero[2] = 3
    for (i in numero.indices) {
        println(numero[i])
    }

    val numero2 = intArrayOf(10, 20, 30)
    for (i in numero.indices) {
        println(numero2[i])
    }

    //Arreglos
    val matriz1 = Array(numero.size)//filas arreglo
    { IntArray(numero.size) } //COlumnas Arreglos
    val matriz2 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6)
    )

    //Acceder a un elemento
    println(matriz2[0][0])
    println(matriz2[2][0])

    //Recorrer Arreglo
    for (i in matriz2.indices) {
        for (j in matriz2[i].indices) {
            println()
            println("${matriz2[i][j]}")

        }

    }


}

