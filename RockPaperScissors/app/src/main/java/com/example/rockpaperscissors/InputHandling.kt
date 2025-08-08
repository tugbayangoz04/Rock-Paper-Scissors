package com.example.rockpaperscissors

fun main(){
    println("Please enter a number!")
    var inputString = readln()
    var inputNumber = inputString.toInt()
    var multiplier = 5
    var result = inputNumber * multiplier
    println("$result")
}