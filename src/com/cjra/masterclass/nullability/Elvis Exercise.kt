package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    //  A product costs 29.99.
    //  Ask a user at the console how many products they want to buy.
    //  If the read value is null, use the default of one.
    //  Print the total of the purchase.
    val productPrice = 29.99
    val defaultValue = 3
    println("The price is: $29.99, how many products do you want to buy?")
    val input = readlnOrNull()
    val purchasedProducts = input?.toInt() ?: 3
    println("Total is: $${purchasedProducts * productPrice}")
}