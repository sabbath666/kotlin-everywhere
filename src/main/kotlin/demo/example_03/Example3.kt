package demo.example_03

import kotlin.streams.asStream

fun main() {
    (1..100)
            .asSequence()
            .asStream()
            .map { t ->
                Thread.sleep(100)
                t
            }
            .filter { it % 2 == 0 }
            .mapToInt { it }
            .sum()
}