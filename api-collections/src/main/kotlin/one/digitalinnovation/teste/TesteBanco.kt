package one.digitalinnovation.teste

import one.digitalinnovation.Banco

fun main() {
    val digitalinnovation = Banco("DigiOne",12)

            println(digitalinnovation.nome)
            println(digitalinnovation.numero)

    val Banco2 = digitalinnovation.copy(nome = "Banco2")

    println(Banco2.info())


}