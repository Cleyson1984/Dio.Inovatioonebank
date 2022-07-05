package one.digitalinnovation

class Pessoa{
    var NOME: String = "Cleyson"

    var CPF: String = "001.002.003.00"
    private set

    constructor()

    fun pessoaInfo() = "$NOME = $CPF"

}

fun main() {
    val Cleyson = Pessoa()

    println(Cleyson)
    println(Cleyson.pessoaInfo())
}