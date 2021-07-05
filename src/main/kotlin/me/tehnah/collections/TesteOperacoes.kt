package me.tehnah.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salrio: ${salarios.minOrNull()} ")
    println("Media salarial: ${salarios.average()}")
    //average da a media

    println("------------------------")

    val salariosmaiorque1500 = salarios.filter { it>2500.0 }
    salariosmaiorque1500.forEach { println(it)}

    println("------------------------")

    println(salarios.count { it in 2000.0..5000.0 })
    //Mostra a quantidade verdadeira dentro do intervalo

    println("------------------------")

    println(salarios.find { it ==2250.0 })
    println(salarios.find { it == 500.0 })

    println("------------------------")

    println(salarios.any { it == 2250.0 })
    println(salarios.any { it == 250.0 })




}
