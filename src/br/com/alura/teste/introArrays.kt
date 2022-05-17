package br.com.alura.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testList() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1865
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}

fun arrayFour() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaMenoresSalarios)
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}

fun testaArraysQuatro() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val media: Double = idades.average()
    println(media)

    val todosMaiores = idades.all { it >= 18 }
    println(todosMaiores)

    val existeMaior = idades.any { it >= 18 }
    println(existeMaior)

    val maiores = idades.filter { it >= 18 }
    println(maiores)

    val busca = idades.find { it > 18 }
    println(busca)
}

fun testaArraysTres() {
    var serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    var numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 400.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}

fun testaArraysDois() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}

fun testaArraysUm() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        println(idade)
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        println(idade)
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}