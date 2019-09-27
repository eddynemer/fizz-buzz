package com.olbati

import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    fun given_input_is_multiple_of_3_should_return_fizz() {
        Assert.assertEquals("Fizz", fizzBuzz.process(3))
        Assert.assertEquals("Fizz", fizzBuzz.process(6))
        Assert.assertEquals("Fizz", fizzBuzz.process(12))
    }

    @Test
    fun given_input_is_multiple_of_5_should_return_buzz() {
        Assert.assertEquals("Buzz", fizzBuzz.process(5))
        Assert.assertEquals("Buzz", fizzBuzz.process(10))
        Assert.assertEquals("Buzz", fizzBuzz.process(20))
    }

    @Test
    fun given_input_is_multiple_of_3_and_5_should_return_fizzbuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.process(15))
        Assert.assertEquals("FizzBuzz", fizzBuzz.process(30))
        Assert.assertEquals("FizzBuzz", fizzBuzz.process(45))
    }

    @Test
    fun given_input_is_not_multiple_of_3_and_5_should_return_input() {
        Assert.assertEquals("4", fizzBuzz.process(4))
        Assert.assertEquals("7", fizzBuzz.process(7))
        Assert.assertEquals("17", fizzBuzz.process(17))
    }

    @Test(expected = IllegalArgumentException::class)
    fun given_input_lower_than_1_should_throw_exception() {
        fizzBuzz.process(0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun given_input_greater_than_100_should_throw_exception() {
        fizzBuzz.process(101)
    }
}