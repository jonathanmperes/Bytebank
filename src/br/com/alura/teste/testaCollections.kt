package br.com.alura.teste

private fun testaMutableMap() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
    val mensagem = pedidos.getOrElse(1) {
        0.0
    }
    println(mensagem)

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)
}

private fun testaMap() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 100.0)
    println(pedidos)
}

private fun testaCopia() {
    val banco = BancoDeNome()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNome().nomes)
}

private fun testeTeste() {
    val a = 5
    val b = 5
    val c = 20
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        if (a == b && a == c) {
            println("Triangulo EQUILATERO")
        } else if (a == b || b == c || a == c) {
            println("Triangulo ISOSCELES")
        } else {
            println("Triangulo ESCALENO")
        }
    } else {
        println("Não é triangulo")
    }

//    var resultado = 0

    var num = 0
    while (num <= 10) {
        num = num + 0
    }
    if (num > 10) {
        println(num)
    }
    var aliquota = 0.0
    var salario = 15.000
    if (salario <= 1.500) {
        aliquota = 0.5
    } else if (salario <= 2.500) {
        aliquota = 0.10
    } else {
        aliquota = 0.15
    }
    var resultado = salario * (aliquota / 100)
    println(resultado)
    var atual = 1
    var valor = 1
    var numero = 6

    while (atual <= numero) {
        valor = valor * atual
        atual = atual + 1
    }
}

class BancoDeNome {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecoes() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}")
}