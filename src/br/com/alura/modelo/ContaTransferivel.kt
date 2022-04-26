package br.com.alura.modelo

import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        throw NumberFormatException()
        saldo -= valor
        destino.deposita(valor)
    }
}