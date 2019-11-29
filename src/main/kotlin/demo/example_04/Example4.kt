package demo.example_04

import kotlin.random.Random

fun main() {
    val showTemperature = false
//    val temperature = getTemperature()
    val temperature by lazy { getTemperature() }
    if (showTemperature && temperature>20){
        println()
    }
//    println(temperature)
//    println(temperature)
//    println(temperature)

}

fun getTemperature():Int {
    println("get temperature executed")
    return Random.nextInt(30)

}
