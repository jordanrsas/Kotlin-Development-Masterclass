package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    //  Read a message from the console.
    //  Print out either the message or a default greeting.
    println("Please write a message")
    val message = readlnOrNull()
    println(message ?: "No message, generic greetings")

    //  Read a number from the console.
    //  Assume you know that the user has entered a value, and the read variable is not null.
    //  Multiply that number by 5 and print the result.
    println("Please, input a number")
    val input = readlnOrNull()
    val number = input?.toInt()
    println("$number multiplied by 5 is: ${number!! * 5}")
}