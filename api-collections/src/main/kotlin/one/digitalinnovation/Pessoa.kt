package one.digitalinnovation

class Pessoa{
    var NOME: String = "Cleyson"

    var CPF: String = "001.002.003.00"
    private set
}

fun main() {
    val Cleyson = Pessoa()

    println(Cleyson)
    println(Cleyson.NOME)
    println(Cleyson.CPF)
}