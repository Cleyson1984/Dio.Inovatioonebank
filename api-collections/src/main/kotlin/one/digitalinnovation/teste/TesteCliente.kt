package one.digitalinnovation.teste

import one.digitalinnovation.Cliente
import one.digitalinnovation.ClienteTipo

fun main(){
    val jose = Cliente(
        nome ="Jose da Silva",
        cpf = "123.123.456.12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
        )

    println(jose)
    TesteAutenticacao().autentica(jose)
}

