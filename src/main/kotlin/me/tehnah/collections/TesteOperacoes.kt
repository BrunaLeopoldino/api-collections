package me.tehnah.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salrio: ${salarios.min()} ")
    println("Media salarial: ${salarios.average()}")
    //average da a media

    println("------------------------")

    val salariosmaiorque1500 = salarios.filter { it>2500.0 }
    salariosmaiorque1500.forEach { println(it)}
}