fun main() {

    println("Bem vindo ao Bytebank")

    val contaAlex = Conta(
        titular = "Alex",
        numero = 1000
    )
    contaAlex.deposita(200.0)

    val contaFran = Conta(
        titular = "Fran",
        numero = 1001
    )
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando da conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta da Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferindo da conta da Fran para o Alex")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha na transferência")
    }
}

class Conta(
    var titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

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

fun testaCondicoes(saldo: Double) {
    // exemplo when
    when {
        saldo > 0.0 -> println("Saldo conta é positivo")
        saldo == 0.0 -> println("Saldo conta é neutro")
        else -> println("Saldo conta é negativo")
    }

    // exemplo if
    if (saldo > 0.0) println("Saldo conta é positivo")
    else if (saldo == 0.0) println("Saldo conta é neutro")
    else println("Saldo conta é negativo")
}