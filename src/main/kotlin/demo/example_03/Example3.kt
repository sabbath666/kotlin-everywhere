package demo.example_03

import kotlin.streams.asStream
import kotlin.system.measureTimeMillis

fun main() {
    println(measureTimeMillis {
        (1..100)
//                .asSequence()
//                .asStream()
                .map { t ->
                    Thread.sleep(100)
                    t * t
                }
                .filter { it % 2 == 0 }
//            .mapToInt { it }
//            .sum()
    }
    )
}