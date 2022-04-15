class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonicacao(): Double {
        return salario * 0.05
    }
}