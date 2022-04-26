package br.com.alura.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)