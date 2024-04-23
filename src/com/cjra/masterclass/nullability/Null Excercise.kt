package com.cjra.masterclass.nullability

//  Read a number from the console and convert it to Double.
//  Multiply it by 7, and convert the result into a string.
//  Print the length of that string to the console.
fun main(args: Array<String>) {
    println("Please insert a number")
    val input = readlnOrNull()
    val number = input?.toDouble()?.times(7)
    println("Length of $number is ${number?.toString()?.length}" )
}

//Please insert a number
//34.54
//Length of 241.78 is 6