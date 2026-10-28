class CuentaBancaria(var titular: String, var numeroCuenta: Int) {

    var saldo: Double = 0.0

    //depositar(monto) en Double mostrar el dinero
    fun depositar(monto: Double): Double {
        saldo += monto
        println("Se deposito:")
        return saldo

    }

    //retirar(monto) decir que se retiro dinero
    fun retirar(monto: Double): Double {
        saldo -= monto
        println("Se retiro: $monto")
        println("Saldo actual: $saldo")
        return saldo

    }

    //trasnferir(destino: CuentaBancaria, monto: Double) trasnferir el dinero
    fun transferir(destino: CuentaBancaria, monto: Double): Double {
        var envio = destino.depositar(monto)
        saldo -= monto
        return envio
    }

    //interes(porcentaje) incrementa el saldo segun el porcentaje
    fun aplicarInteres(porcentaje: Double) {
        var interes = saldo * porcentaje
        saldo += interes
        println("Su nuevo saldo con interes $saldo")
    }

    fun retirarTodo(): String {
        if (saldo > 0) {
            println("Se ha retirado: $saldo")
            saldo -= saldo
        }
        return "Su saldo actual es: $saldo"
    }

    //mostrarInfo poner datos como titular, cuenta y el saldo
    fun mostrarInfo(): String {
        return "DATOS DE LA CUENTA: \nTitular: $titular \nNum de Cuenta: $numeroCuenta \nSaldo Actual: $saldo "

    }
}

fun main() {

    var cuenta1 = CuentaBancaria("Joseph", 2222)
    var cuenta2 = CuentaBancaria("Ruben", 333)

    println(cuenta1.depositar(10.00))
    println()
    println(cuenta1.depositar(20.00))
    println()
    println(cuenta1.mostrarInfo())
    println()
    println(cuenta1.transferir(cuenta2, 5.00))
    println()
    println(cuenta2.mostrarInfo())
    println()
    println(cuenta1.mostrarInfo())
    println()
    cuenta1.aplicarInteres(0.10)
    println()
    println(cuenta1.retirar(2.50))
    println()
    println(cuenta2.retirarTodo())
    println()
    println(cuenta1.mostrarInfo())
    println()
    println(cuenta2.mostrarInfo())
}


