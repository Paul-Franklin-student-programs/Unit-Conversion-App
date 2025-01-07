package com.example.unitconverter

fun celsiusToFahrenheit(celsius: Double): Double{
    val tempF: Double = (celsius * (9.0 / 5.0)) + 32
    return tempF
}

fun fahrenheitToCelsius(fahrenheit: Double): Double{
    val tempC: Double = (fahrenheit - 32) * 5.0 / 9.0
    return tempC
}

fun kilogramsToPounds(kilograms: Double): Double{
    val pounds: Double = kilograms * 2.205
    return pounds
}

fun poundsToKilograms(pounds: Double): Double{
    val kilograms: Double = pounds * 0.45359237
    return kilograms
}

fun metersToFeet(meters: Double): Double{
    val feet: Double = meters * 3.28084
    return feet
}

fun feetToMeters(feet: Double): Double{
    val meters: Double = feet * 0.3048
    return meters
}