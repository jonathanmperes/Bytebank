package br.com.alura.teste

import br.com.alura.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${endereco.hashCode()}")
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}
