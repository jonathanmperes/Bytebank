package br.com.alura.teste

import br.com.alura.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Prédio")

    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    println(enderecoNulo?.logradouro?.length)
}
