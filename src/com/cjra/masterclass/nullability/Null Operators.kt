package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    var catName: String? = "Chonkers"
    println(catName?.length?.toString())
    catName = null
    println(catName?.length?.toString())
}