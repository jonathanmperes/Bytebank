fun testaCondicoes(saldo: Double) {
    // exemplo when
    when {
        saldo > 0.0 -> println("Saldo conta é positivo")
        saldo == 0.0 -> println("Saldo conta é neutro")
        else -> println("Saldo conta é negativo")
    }

    // exemplo if
    if (saldo > 0.0) println("Saldo conta é positivo")
    else if (saldo == 0.0) println("Saldo conta é neutro")
    else println("Saldo conta é negativo")
}