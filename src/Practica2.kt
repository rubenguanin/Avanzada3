fun main() {
    val filas = 3
    val columnas = 3

    // 1. Matriz A (3x3)
    val matrizA = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            print("${matrizA[i][j]}\t")
        }
        println()
    }

    val matrizB = Array(filas) { IntArray(columnas) }

    println("Por teclado: ")
    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            print("posición [$i][$j]: ")
            matrizB[i][j] = readln().toInt()
        }
    }

    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            print("${matrizB[i][j]}")
        }
        println()
    }
    println("Resukt")
    val matriz3 = Array(filas) { IntArray(columnas) }

    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            matriz3[i][j] = matrizA[i][j] + matrizB[i][j]
        }
    }

    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            print("${matriz3[i][j]}")
        }
        println()
    }
}