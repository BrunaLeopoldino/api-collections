package me.tehnah.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "André"

    for (nome in nomes){
        println(nome)
    }

    println("------------------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------------")
    val nomes2 = arrayOf("Maria","Julio","Zaza")
    nomes2.sort()
    nomes2.forEach { println(it) }

}