package demo.example_05

import java.lang.RuntimeException

fun main() {
    val itsTrue = false
    throw RuntimeException("")
    if (itsTrue) {
        println("That's true")
    }

}