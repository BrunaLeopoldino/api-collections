package me.tehnah.collections

fun main() {
    val values= intArrayOf(1,4,5,10,15,2)

    values.forEach {
        println(it)
    }

    println("--------------")

    values.sort()
    values.forEach {
        println(it)
    }
}