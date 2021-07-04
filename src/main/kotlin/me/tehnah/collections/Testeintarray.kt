package me.tehnah.collections

fun main() {
    val values= IntArray(5)

    values [0] = 3
    values [1] = 5
    values [2] = 7
    values [3] = 4
    values [4] = 9

    for (valor in values) {
        println(valor)
    }

    println("=========================================")
//Chama o valor sem variavel, sendo o "it" a variavel
    values.forEach {
        println(it)
    }

    println("=========================================")
    //Uma maneira de chamar o vlor com uma variavel especifica
    values.forEach { valor->
        println(valor)
    }

    println("=========================================")
    //Chama atraves do indice
    for (index in values.indices){
        println(values[index])

    }
    println("=========================================")
    //Ordena do menor para o maior
    values.sort()
    for (valor in values) {
        println(valor)
    }
}
