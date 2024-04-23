package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    val herName: String = "Lilly"
    val hisName: String? = null
    println(herName)
    println(hisName)

    //Values that can be null
    var catName: String? = "Chonkers"
    catName = null

    //Values that can NOT be null
    var dogName: String = "Fluffy"
    //dogName = null  -> Compilation error

    println(catName)
    println(dogName)
}