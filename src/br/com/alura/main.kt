import br.com.alura.exception.SaldoInsuficienteException
import br.com.alura.modelo.Endereco

fun main() {
    println("início main")
    testaComportamentosConta()
    println ("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("SaldoInsuficienteExceptions foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}