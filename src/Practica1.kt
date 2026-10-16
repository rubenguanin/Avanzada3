fun main() {
    var positivos = 0
    var negativo = 0
    var ceros = 0

    for (i in 1..10) {
        print("Ingresar")
        var n = readln().toInt()
        if (n > 0) {
            println("positiva")
            positivos++

        } else if (n < 0) {
            negativo++
            println("negativa")
        } else {
            ceros++
        }}
    var a = true

        while (a) {
            println("1.-positivos")
            println("2.-negativo")
            println("3.-cero")
            println("4.-salir ")
            val c = readln().toInt()
            if (c ==1) {
                println ("$positivos")
                a= false
            }else if (c ==2) {
                println ("$negativo")
                a = false
            }else if (c ==3) {
                println ("$ceros")
                a = false
            }else if (c ==4) {
                a = false
            }
            else {
                print ("no vale ")
            }

        }






    }


