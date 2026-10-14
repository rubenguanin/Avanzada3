//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")

    //variables
    //var(mutables-cambian) y val (inmutables-no cambian)

    val num0 = 2
    val num1 : Int = 10
    //num0 = 10 va a dar error porque es una variable inmutable
    val edad = 25
    var num2 : Int //cuando es minima se puede declarar sin inicializar o sino solo asi var num2 : Int =10
    var num3 : Int = 15
    var num4 = 0
    num4 = 20 //se puede cambiar el valor de una variable mutable

    //Operadores (+ - * / %)
    var nuevoNum = num0 + num1

    val numA=10
    val numB=20
    val total = numA + numB
    println(total)

    println("la suma es: " + total) //no esta mal pero tampoco bien
    println("la suma es: $total") // Correcta

    //Ingreso de datos por teclado
    println("Ingrese nombre: ")
    val nombre = readln()
    println("Ingrese apellido: ")
    val apellido = readln()
    println("Su nombre completo es: $nombre $apellido")

    println("Ingrese edad: ")
    val edad1 = readln().toInt() //convertir a entero con el .to se puede convertir a otros tipos de datos
    println("Su nombre completo es: $nombre $apellido con edad $edad1 ")






















}