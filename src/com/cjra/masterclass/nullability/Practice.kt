package com.cjra.masterclass.nullability


fun main(args: Array<String>) {
    //  Declare a nullable variable of type String and give it a value.
    //  Print out a substring of it, from position 3 to 6.
    var stringVariable: String? = "I like dogs"
    println(stringVariable?.substring(3, 6))

    //  Declare a nullable variable of type Double.
    //  Multiply it by 6, convert it to a Float and print it to the console.
    var doubleVariable: Double? = 13.94
    println(doubleVariable?.times(6)?.toFloat())

    // doubleVariable * 6
    // doubleVariable *= 6
    // do not work, it is necessary the null operator ?
    doubleVariable = doubleVariable?.times(6)
    println(doubleVariable?.toFloat())

    //  Receive the name of the user from the console.
    //  Print out the length of the name.
    var userName = readlnOrNull() //replace readLine() with read or Null operator.
    println(userName?.length)
}