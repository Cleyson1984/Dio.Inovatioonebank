package one.digitalinnovation.teste

import one.digitalinnovation.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun Imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}