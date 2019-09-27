package com.olbati

class FizzBuzz() {
    var config = HashMap<Int, String>()

    init {
        config[3] = "Fizz"
        config[5] = "Buzz"
    }

    fun process(input: Int): String {
        require(input in 1..100)
        val builder = StringBuilder()
        for (i in config) {
            if (input % i.key == 0) {
                builder.append(i.value)
            }
        }
        return when (builder.toString()) {
            "" -> input.toString()
            else -> builder.toString()
        }
    }
}

