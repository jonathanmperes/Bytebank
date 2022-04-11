class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    fun bonicacao(): Double {
        return salario * 0.1
    }
}