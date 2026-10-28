fun main() {

    var matriz = arrayOf(
        intArrayOf(8, 1, 6), //(00,01,02)
        intArrayOf(3, 5, 7), //(10,11,12)
        intArrayOf(4, 9, 2)  //(20,21,22
    )

    //suma de filas
    var suma1 = matriz[0][0] + matriz[0][1] + matriz[0][2]
    var suma2 = matriz[1][0] + matriz[1][1] + matriz[1][2]
    var suma3 = matriz[2][0] + matriz[2][1] + matriz[2][2]

    var suma = suma1 + suma2 + suma3
    println("Suma de filas: $suma")
    //suma de columnas
    var colum1 = matriz[0][0] + matriz[1][0] + matriz[2][0]
    var colum2 = matriz[0][1] + matriz[1][1] + matriz[2][1]
    var colum3 = matriz[0][2] + matriz[1][2] + matriz[2][2]

    var sumaC = colum1 + colum2 + colum3
    println("Suma de columnas: $sumaC")

    //suma de diagonales es igual es magica
    var diagP: Int = matriz[0][0] + matriz[1][1] + matriz[2][2]
    var diagS: Int = matriz[2][0] + matriz[1][1] + matriz[0][2]

    println("Sumas diagonal 1: $diagP")
    println("Sumas diagonal 2: $diagS")

    if (diagP == diagS && suma == sumaC) {
        println("El cubo es magico")
    } else {
        println("El cubo no es magico")
    }
}