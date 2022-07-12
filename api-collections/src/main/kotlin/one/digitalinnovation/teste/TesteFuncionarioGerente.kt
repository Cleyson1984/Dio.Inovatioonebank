package one.digitalinnovation.teste

import one.digitalinnovation.Gerente

fun main() {
    val Maria = Gerente("Maria do Carmo","001.002.003.04" , 5000.0,"senha123")

    ImprimeRelatorioFuncionario.Imprime(Maria)

    TesteAutenticacao().autentica(Maria)

}

