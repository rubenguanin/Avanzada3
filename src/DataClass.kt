// data class: es una clase de datos(esta diseñada para alamcenar, trasnportar y comparar infromacion)

//usando data class kotlin genera ciertos metodos como imprimir, to string, equals , hashcode, copy


data class Cuenta(val saldo: Double) {


}


fun depositar(cuenta: Cuenta, cantidad: Double): Cuenta {

    return cuenta.copy(saldo = cuenta.saldo + cantidad)

}


fun retirar(cuenta: Cuenta, cantidad: Double): Cuenta {

    return cuenta.copy(saldo = cuenta.saldo - cantidad)


}


fun main() {

    val cuentaInicial = Cuenta(10000.1)

    val cuentaDepositar = depositar(cuentaInicial, 100.0)

    val cuentaRetiro = retirar(cuentaDepositar, 20.0)

    println(cuentaInicial)

    println(cuentaDepositar)

    println(cuentaRetiro)


}