package com.cjra.masterclass.nullability

fun main(args: Array<String>) {
    val a: Double? = 10.00
    println(a?.plus(3))   //13.00
    println(a?.minus(3))  //7.0
    println(a?.times(3))  //30.0
    println(a?.div(3))    //3.33333333
    println(a?.rem(3))    //1.0
}