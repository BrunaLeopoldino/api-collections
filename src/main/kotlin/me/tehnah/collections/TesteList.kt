package me.tehnah.collections

fun main() {
    val joao=funcionario("João",3500.0, "clt")
    val pedro=funcionario("Pedro",2000.0, "pJ")
    val maria=funcionario("Maria",4000.0,"clt")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {println(it)}

    println("------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------------")

    funcionarios.sortedBy { it.salario } .forEach { println(it) }
//organiza em ordem a partir da it. que vc quiser (salario/nome/ etc)

    println("------------------------------")
    funcionarios.groupBy { it.tipoContratacao } .forEach { println(it) }
//agrupamento




}

data class funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        //organiza os dados um embaixo do outro como neste exemplo
        """
            Nome:    $nome
            Salario: $salario
    
        """.trimIndent() }
