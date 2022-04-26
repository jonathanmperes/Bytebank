import br.com.alura.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro")
        ),
        numero = 1000
    )

    println("Titular ${contaCorrente.titular}")
    println("Nome do titular: ${contaCorrente.titular.nome}")
    println("Cpf do titular: ${contaCorrente.titular.cpf}")
    println("Saldo do titular: ${contaCorrente.saldo}")
    println("Endereço do titular: ${contaCorrente.titular.endereco.logradouro}")

    val contapoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Gui", cpf = "", senha = 3),
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

    contaCorrente.transfere(100.0, contapoupanca, 1)

    println("Saldo conta corrente após transferencia para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferencia: ${contapoupanca.saldo}")

    contapoupanca.transfere(100.0, contaCorrente, 2)

    println("Saldo conta poupança após transferencia para corrente: ${contapoupanca.saldo}")
    println("Saldo conta corrente após receber transferencia: ${contaCorrente.saldo}")
}