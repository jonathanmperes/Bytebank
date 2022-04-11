class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {
    fun bonicacao(): Double {
        return salario * 0.1
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}