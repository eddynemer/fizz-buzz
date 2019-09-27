package com.olbati

fun main() {
    val fizzBuzz = FizzBuzz()
    for (i in 1..100) {
        println(fizzBuzz.process(i))
    }
}