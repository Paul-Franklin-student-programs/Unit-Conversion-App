private fun celsiusToFahrenheit(celsius: Double): Double{
    val tempF: Double = (celsius * (9.0 / 5.0)) + 32
    return tempF
}

private fun fahrenheitToCelsius(fahrenheit: Double): Double{
    val tempC: Double = (fahrenheit - 32) * 5.0 / 9.0
    return tempC
}

private fun kilogramsToPounds(kilograms: Double): Double{
    val pounds: Double = kilograms * 2.205
    return pounds
}

private fun poundsToKilograms(pounds: Double): Double{
    val kilograms: Double = pounds * 0.453
    return kilograms
}

private fun metersToFeet(meters: Double): Double{
    val feet: Double = meters * 3.28
    return feet
}

private fun feetToMeters(feet: Double): Double{
    val meters: Double = feet * 0.304
    return meters
}