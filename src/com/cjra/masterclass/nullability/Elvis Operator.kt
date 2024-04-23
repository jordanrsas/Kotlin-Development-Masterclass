package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    var catName: String? = null
    println(catName ?: "this cat has no name")
    //  After Elvis operator is not needed any more use the null safety operator '?'
    println(catName ?: "Fluffy".length)

    catName = "Fluffy"
    println(catName ?: "this cat has no name")

}