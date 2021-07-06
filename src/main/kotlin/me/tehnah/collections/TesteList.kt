package me.tehnah.collections

fun main() {
    val joao=Funcionario("João",3500.0, "clt")
    val pedro=Funcionario("Pedro",2000.0, "pJ")
    val maria=Funcionario("Maria",4000.0,"clt")

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

