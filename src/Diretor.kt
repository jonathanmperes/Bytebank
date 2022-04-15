class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonicacao(): Double {
        return salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}