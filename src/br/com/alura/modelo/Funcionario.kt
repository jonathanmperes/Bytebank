package br.com.alura.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract fun bonicacao(): Double
}