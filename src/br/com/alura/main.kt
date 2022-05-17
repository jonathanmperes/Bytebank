import br.com.alura.teste.testaNullable

fun main() {

//    testaTipoFuncaoReferencia()

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("Executa anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("Executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }

}