fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contapoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contapoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contapoupanca.saldo}")
    println("Saldo conta salario: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contapoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contapoupanca.saldo}")
    println("Saldo conta salario após saque: ${contapoupanca.saldo}")

    contaCorrente.transfere(100.0, contapoupanca)

    println("Saldo conta corrente após transferencia para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferencia: ${contapoupanca.saldo}")

    contapoupanca.transfere(100.0, contaCorrente)

    println("Saldo conta poupança após transferencia para corrente: ${contapoupanca.saldo}")
    println("Saldo conta corrente após receber transferencia: ${contaCorrente.saldo}")
}