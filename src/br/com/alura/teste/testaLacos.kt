fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = 300.0 + i

        println("Titular da conta: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = 300.0 + i

        println("Titular da conta: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}
