import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException
import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "",
        senha = 1
    )
    val contaAlex = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    contaAlex.deposita(200.0)

    val fran = Cliente(
        nome = "Fran",
        cpf = "",
        senha = 2
    )

    val contaFran = ContaPoupanca(
        titular = fran,
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

    try {
        contaFran.transfere(250.0, contaAlex, 2)
        println("Transferência realizada com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }
}