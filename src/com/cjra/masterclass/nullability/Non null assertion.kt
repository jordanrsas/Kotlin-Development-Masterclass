package com.cjra.masterclass.nullability

//  !!.	A developer guarantee that the variable is not null
/************************************************************
Warning: This bypasses all the language checks for null safety
Can trigger a program crash
Try to avoid it as much as you can
 *************************************************************/
fun main(args: Array<String>) {
    var catName: String? = null
    //println(catName!!.length)
    //Exception in thread "main" java.lang.NullPointerException
    //	at com.cjra.masterclass.nullability.Non_null_assertionKt.main(Non null assertion.kt:5)

    catName = "Fluffy"
    println(catName!!.length)
}