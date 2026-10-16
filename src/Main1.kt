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

    val matriz2 =  arrayof(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6),
    )


}

